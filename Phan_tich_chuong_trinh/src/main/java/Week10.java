import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Week10 {

    private static final ArrayList<String> defaultTypes = new ArrayList<>(Arrays.asList(
            "int", "double", "boolean", "char",
            "float", "long", "short", "bytes", "T[]"));

    private static boolean canScan = true;

    private static String packageName;
    private static ArrayList<String> classes;
    private static HashMap<String, String> imports;

    public Week10() {

    }

    public Week10(boolean canScan, String packageName) {

    }

    public Week10(String packageName, ArrayList<String> classes) {

    }

    /**
     * Javadoc.
     * Comment.
     */

    public static List<String> getAllFunctions(String fileContent) {
        packageName = getPackage(fileContent);
        classes = getClasses(fileContent);
        imports = getImports(fileContent);
        imports.put("QueryAPI", "com.nordstrom.common.jdbc.utils.QueryAPI");
        imports.put("SProcAPI", "com.nordstrom.common.jdbc.utils.SProcAPI");
        imports.put("Param", "com.nordstrom.common.jdbc.Param");
        ArrayList<String> functions = getStatic(fileContent);
        for (int i = 0; i < functions.size(); i++) {
            functions.set(i, processFunction(functions.get(i)));
        }
        return functions;
    }

    /**
     * Javadoc.
     * comment.
     */
    private static String scan(Scanner scanner) {
        String input;
        input = scanner.next();
        switch (input) {
            case "//":
                scanner.nextLine();
                canScan = true;
                return null;
            case "/*":
            case "/**":
                canScan = false;
                return null;
            case "*/":
            case "**/":
                canScan = true;
                return null;
            default:
                break;
        }
        if (canScan) {
            return input;
        } else {
            return null;
        }
    }

    public Week10(ArrayList<String> classes, HashMap<String, String> imports) {

    }

    private static String getPackage(String fileContent) {
        Scanner scanner = new Scanner(fileContent);
        while (scanner.hasNext()) {
            String input = scan(scanner);
            if (input == null) {
                continue;
            }
            if (input.equals("package")) {
                String packageName = scanner.next();
                if (packageName.contains(";")) {
                    packageName = packageName.substring(0, packageName.indexOf(";"));
                }
                return packageName;
            }
        }
        return "";
    }

    public Week10(HashMap<String, String> imports) {

    }

    /**
     * Javadoc.
     * comment.
     */
    private static ArrayList<String> getClasses(String fileContent) {
        Scanner scanner = new Scanner(fileContent);
        ArrayList<String> classes = new ArrayList<>();
        while (scanner.hasNext()) {
            String input = scan(scanner);
            if (input == null) {
                continue;
            }
            if (input.equals("class")) {
                String className = scanner.next();
                if (className.contains(";")) {
                    className = className.substring(0, className.indexOf(";"));
                }
                classes.add(className);
            }
        }
        return classes;
    }

    /**
     * Javadoc.
     * comment.
     */
    private static HashMap<String, String> getImports(String fileContent) {
        Scanner scanner = new Scanner(fileContent);
        HashMap<String, String> imports = new HashMap<>();
        while (scanner.hasNext()) {
            String input = scan(scanner);
            if (input == null) {
                continue;
            }
            if (input.equals("import")) {
                if (scanner.hasNext()) {
                    String importName = scanner.next();
                    if (importName.equals("static")) {
                        continue;
                    }
                    if (importName.contains(";")) {
                        importName = importName.substring(0, importName.indexOf(";"));
                    }
                    String[] importNameSplit = importName.split("\\.");
                    imports.put(importNameSplit[importNameSplit.length - 1], importName);
                }
            }
        }
        return imports;
    }

    /**
     * Javadoc.
     * comment.
     */
    private static ArrayList<String> getStatic(String fileContent) {
        Scanner scanner = new Scanner(fileContent);
        ArrayList<String> functions = new ArrayList<>();
        while (scanner.hasNext()) {
            String input = scan(scanner);
            if (input == null) {
                continue;
            }
            if (input.equals("static")) {
                String functionName = "";
                while (scanner.hasNext()) {
                    String input1 = scanner.next();
                    if (!input1.equals("class") && !input1.equals("final")) {
                        functionName += input1 + " ";
                        if (functionName.contains(";")) {
                            break;
                        }
                        if (functionName.contains("{")) {
                            String output = functionName.replace("{", "").trim();
                            if (!output.equals("")) {
                                String[] t = output.split(" ", 2);
                                if (t[0].contains("<")) {
                                    functions.add(output.substring(Math.max(output.indexOf(">"),
                                            output.indexOf("]")) + 1).trim());
                                } else {
                                    functions.add(t[1]);
                                }
                            }
                            break;
                        }

                    } else {
                        break;
                    }
                }
            }
        }
        return functions;
    }

    /**
     * Javadoc.
     * comment.
     */
    private static String processFunction(String s) {
        String functionName = s.substring(0, s.indexOf("("));
        String functionParams = s.substring(s.indexOf("(") + 1, s.indexOf(")"));
        String[] functionParamsSplit = functionParams.split(",");
        ArrayList<String> params = new ArrayList<>();
        for (String value : functionParamsSplit) {
            String[] subSplit = value.trim().split(" ");
            params.add(subSplit[0].replace("...", ""));
        }
        for (int i = 0; i < params.size(); i++) {
            params.set(i, convertParams(params.get(i)));
        }
        return functionName + "(" + String.join(",", params) + ")";
    }

    private static String display(String s) {
        s = "a";
        return s;
    }
    /**
     * Javadoc.
     * comment.
     */

    private static String convertParams(String typeName) {
        if (typeName.contains("<")) {
            String dataStructure = typeName.substring(0, typeName.indexOf("<"));
            String dataStructureParams = typeName.substring(typeName.indexOf("<") + 1,
                    typeName.indexOf(">"));
            String[] dataStructureParamsSplit = dataStructureParams.split(",");
            ArrayList<String> params = new ArrayList<>();
            for (String s : dataStructureParamsSplit) {
                String[] subSplit = s.trim().split(" ");
                params.add(subSplit[0].replace("...", ""));
            }
            for (int i = 0; i < params.size(); i++) {
                params.set(i, convertTypeName(params.get(i)));
            }
            return convertTypeName(dataStructure) + "<"
                    + String.join(",", params) + ">";
        } else {
            return convertTypeName(typeName);
        }
    }

    /**
     * Javadoc.
     * comment.
     */

    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    /**
     * Javadoc.
     * Comment.
     */

    private static String convertTypeName(String typeName) {
        if (typeName.length() <= 1) {
            return typeName;
        }
        if (defaultTypes.contains(typeName)) {
            return typeName;
        }
        if (imports.containsKey(typeName)) {
            return imports.get(typeName);
        } else if (classes.contains(typeName)) {
            return packageName + "." + typeName;
        } else {
            return "java.lang." + typeName;
        }
    }

    public static void main(String[] args) {

    }

}

