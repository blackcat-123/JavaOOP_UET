# JavaOOP_UET

Bài tập và bài tập lớn môn **Lập trình hướng đối tượng** — Trường Đại học Công nghệ, Đại học Quốc gia Hà Nội (UET).

Repository này tổng hợp các bài thực hành, bài kiểm tra và đồ án lập trình Java theo hướng đối tượng, từ các khái niệm cơ bản đến dự án game hoàn chỉnh.

---

## 📂 Cấu trúc thư mục

| Thư mục | Nội dung |
|---|---|
| `HelloWorld` | Chương trình Java đầu tiên — in "Hello World" |
| `Fibonacci` | Tính dãy số Fibonacci |
| `Gcd` | Thuật toán tìm ước chung lớn nhất (GCD) |
| `SoNguyenTo` | Kiểm tra và liệt kê số nguyên tố |
| `Phanso` | Lớp số phân số (Fraction) với các phép toán cơ bản |
| `NextLine` | Xử lý nhập liệu dòng lệnh (Scanner) |
| `Abstract` | Abstract class — mô hình hóa xe cộ, con người |
| `Interface` | Interface — hình học (Circle, Triangle, GeometricObject) |
| `Bai_kt2_interface` | Bài kiểm tra số 2 về Interface |
| `Kethua1` / `Kethua2` / `Kế thừa 2` | Kế thừa (Inheritance) trong Java |
| `Đa hình 1` / `Đa hình 2` / `Dahinh1` / `Dahinh2` | Đa hình (Polymorphism) — Shape, Circle, Rectangle, Square |
| `Ngoaile1` / `Ngoaile2` / `Ngoai le 2` / `Ngoại lệ 1` | Xử lý ngoại lệ (Exception Handling) — các phép tính số học |
| `Lap trinh tong quat` / `Lap_trinh_tong_quat` | Lập trình tổng quát (Generics) |
| `JUnit` / `JUnit - Copy` | Kiểm thử đơn vị với JUnit |
| `Transaction` | Xử lý giao dịch (Transaction) |
| `QuanliSinhvien` / `qlSinhvien` / `student` | Quản lý sinh viên |
| `Co vua 1` / `Co vua 1 Bai kiem tra` / `Co_vua_1_ktra` | Trò chơi Cờ vua — Board, Piece, Move, Rook |
| `Phan_tich_chuong_trinh` | Phân tích chương trình (Program Analysis) |
| `demo` / `demo1` / `demo2` | Các dự án demo và thử nghiệm |
| `Gametest` | Dự án thử nghiệm game |
| **`BombermanOOP-main`** | **Đồ án lớn — Game Bomberman (JavaFX + FXGL)** |

---

## 🎮 Đồ án lớn: Bomberman

> 📹 Video demo: [YouTube](https://www.youtube.com/watch?v=6XkB1Tdlfk4&t=231s)

Cài đặt lại game Bomberman kinh điển bằng Java, sử dụng framework FXGL trên nền JavaFX.

### Công nghệ
- Java 17 (JDK 17)
- [FXGL](https://github.com/AlmasB/FXGL) — game engine dựa trên JavaFX
- Maven

### Các đối tượng trong game

**Động:**
- `Bomber` — nhân vật chính, di chuyển 4 hướng
- `Enemy` — kẻ địch với nhiều loại AI khác nhau
- `Bomb` — bom do Bomber đặt, nổ sau 2 giây

**Tĩnh:**
- `Grass` — ô trống, có thể đặt bom
- `Wall` — tường cố định, không thể phá
- `Brick` — gạch có thể bị phá bởi bom
- `Portal` — cổng qua màn, ẩn sau Brick

**Items** (ẩn sau Brick):
- `SpeedItem` — tăng tốc độ di chuyển
- `FlameItem` — tăng phạm vi lửa bom
- `BombItem` — tăng số lượng bom có thể đặt
- `PassItem` — bất tử trong thời gian ngắn

### Các loại Enemy

| Loại | Điểm | Hành vi |
|---|---|---|
| Balloom | 100 | Di chuyển ngẫu nhiên, đổi hướng khi va chạm |
| Dahl | 150 | Giống Balloom, tốc độ ngẫu nhiên sau đổi hướng |
| Oneal | 200 | Truy đuổi Bomber trong bán kính nhất định |
| Pass | 300 | Khi chết sinh ra Ovape, Dahl hoặc Balloom |
| Ovape | 400 | Nhanh, vượt chướng ngại vật mềm |
| Doria | 500 | Truy đuổi phạm vi rộng, né tránh bom chủ động |

### Chạy game
```bash
cd BombermanOOP-main
java -jar Bomberman.jar
```

---

## 🛠️ Yêu cầu môi trường

- Java JDK 17+
- Maven (cho dự án Bomberman)

## 👤 Tác giả

[trunglearncs](https://github.com/trunglearncs)
