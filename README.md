
# Triển Khai Mô Hình Phương Tiện

Kho lưu trữ này thể hiện một mô hình đơn giản về các loại phương tiện trong hệ thống giao thông.

## Cấu Trúc Mã

### Gói Vehicle
- `Vehicle_`: Một lớp trừu tượng là cơ sở cho tất cả các loại phương tiện. Chứa các thuộc tính chung và các phương thức trừu tượng.
- `Car`, `Truck`, `Bicycle`, `Boat`: Các lớp đại diện cho từng loại phương tiện cụ thể, mở rộng từ `Vehicle_`.

### Lớp Main
- `Main`: Chứa phương thức main để tạo các đối tượng của các loại phương tiện khác nhau và trình bày chức năng của chúng.

## Chi Tiết Triển Khai

### Lớp Trừu Tượng `Vehicle_`
- Xác định các thuộc tính chung như `tốc độ` và `sức chứa`.
- Bao gồm các phương thức getter và setter cho các thuộc tính này.
- Khai báo các phương thức trừu tượng `getInf()` và `move()` để được cài đặt bởi các lớp con.

### Các Lớp Con (`Car`, `Truck`, `Bicycle`, `Boat`)
- Triển khai các loại phương tiện cụ thể, mỗi loại với các thuộc tính và hành vi đặc trưng riêng.
- Override `getInf()` để hiển thị thông tin cụ thể cho từng loại phương tiện.
- Override `move()` để định nghĩa hành động di chuyển của từng loại phương tiện.

### Thực Thi Lớp `Main`
- Tạo các đối tượng của các loại phương tiện khác nhau (Xe tải, Ô tô, Xe đạp, Thuyền).
- Gọi `getInf()` để hiển thị thông tin về từng loại phương tiện.
- Gọi `move()` để thể hiện hành vi cụ thể của từng loại phương tiện.

3. **Khám Phá Các Loại Phương Tiện:**
- Chỉnh sửa các lớp hiện có hoặc tạo mới để đại diện cho các loại phương tiện khác.
- Sử dụng các phương thức như `getInf()` và `move()` để quan sát hành vi của từng loại phương tiện.


