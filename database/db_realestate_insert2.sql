use real_estate;

INSERT INTO Accommodation (accommodationName, street, ward, district, city, province, direction, size, numberOfRooms, lessorID, accomTypeID)
VALUES
   
    ('Sunrise Apartment', '12 Mai Chí Thọ', 'An Phú', 'Quận 2', 'Hồ Chí Minh', 'Hồ Chí Minh', 'Đông Nam', 150.00, 4, 1, 1),
    ('The Urban Studio', '28 Lê Văn Sỹ', 'Phường 14', 'Quận Phú Nhuận', 'Hồ Chí Minh', 'Hồ Chí Minh', 'Tây Bắc', 60.00, 2, 3, 2),
    ('The Luxe Villa', '15 Nguyễn Văn Cừ', 'Cầu Kho', 'Quận 1', 'Hồ Chí Minh', 'Hồ Chí Minh', 'Nam', 300.00, 6, 3, 3),
    ('The Skyline House', '102 Nguyễn Tri Phương', 'Phường 9', 'Quận 10', 'Hồ Chí Minh', 'Hồ Chí Minh', 'Đông', 50.00, 1, 6, 4),
    ('The Sapphire Room', '7 Điện Biên Phủ', 'Phường 17', 'Quận Bình Thạnh', 'Hồ Chí Minh', 'Hồ Chí Minh', 'Bắc', 35.00, 1, 2, 5),

    ('The Crescent Apartment', '18 Lý Thường Kiệt', 'Tràng Tiền', 'Hoàn Kiếm', 'Hà Nội', 'Hà Nội', 'Tây Nam', 80.00, 3, 5, 1),
    ('The Emerald Studio', '123 Xuân Diệu', 'Quảng An', 'Tây Hồ', 'Hà Nội', 'Hà Nội', 'Đông Bắc', 45.00, 1, 5, 2),
    ('The Lotus House', '56 Cát Linh', 'Cát Linh', 'Đống Đa', 'Hà Nội', 'Hà Nội', 'Nam', 120.00, 3, 7, 4),
    ('The Serene Villa', '202 Láng Hạ', 'Láng Thượng', 'Đống Đa', 'Hà Nội', 'Hà Nội', 'Bắc', 250.00, 5, 1, 3),
    ('The Radiant Room', '5 Nguyễn Văn Huyên', 'Nghĩa Đô', 'Cầu Giấy', 'Hà Nội', 'Hà Nội', 'Tây', 30.00, 1, 4, 5),

    ('The Wave Apartment', '36 Bạch Đằng', 'Hải Châu 1', 'Hải Châu', 'Đà Nẵng', 'Đà Nẵng', 'Đông', 90.00, 2, 4, 1),
    ('The Ocean Pearl Studio', '45 Trần Hưng Đạo', 'Nại Hiên Đông', 'Sơn Trà', 'Đà Nẵng', 'Đà Nẵng', 'Nam', 55.00, 1, 2, 2),
    ('The Golden Sands Villa', '89 Nguyễn Tất Thành', 'Xuân Hà', 'Thanh Khê', 'Đà Nẵng', 'Đà Nẵng', 'Bắc', 230.00, 5, 2, 3),
    ('The Horizon House', '102 Ngũ Hành Sơn', 'Mỹ An', 'Ngũ Hành Sơn', 'Đà Nẵng', 'Đà Nẵng', 'Tây', 140.00, 3, 3, 4),
    ('The Velvet Room', '60 Trần Phú', 'Thạch Thang', 'Hải Châu', 'Đà Nẵng', 'Đà Nẵng', 'Đông Nam', 25.00, 1, 7, 5);
    
INSERT INTO DetailAmenity (accommodationID, amenityID)
VALUES
    (16, 1), (16, 2), (16, 3), (16, 7), (16, 8), (16, 10),
    (17, 1), (17, 7), (17, 8),
    (18, 1), (18, 2), (18, 6), (18, 7), (18, 8), (18, 9), (18, 10), (18, 11),
    (19, 1), (19, 7),
    (20, 1), (20, 7), (20, 8), (20, 10),
    
    (21, 2), (21, 3), (21, 8), (21, 10),
    (22, 1), (22, 7), (22, 8),
    (23, 1), (23, 2), (23, 3), (23, 4), (23, 6), (23, 7), (23, 8), (23, 9), (23, 10), (23, 11),
    (24, 1),
    (25, 8), (25, 10),
    
    (26, 1), (26, 3), (26, 7), (26, 8), (26, 10),
    (27, 1), (27, 7), (27, 8),
    (28, 1), (28, 2), (28, 3), (28, 6), (28, 7), (28, 8), (28, 9), (28, 10), (28, 11),
    (29, 2),
    (30, 1), (30, 7), (30, 8);


INSERT INTO DetailRentType (accommodationID, rentTypeID, price, deposit)
VALUES
	(16, 1, 220000000, 50000000), (16, 2, 55000000, 15000000), (16, 3, 20000000, 5000000),
    
    (17, 4, 900000, 200000), (17, 6, 150000, 30000),
    
	(18, 1, 400000000, 120000000), (18, 2, 100000000, 35000000), (18, 3, 35000000, 10000000),
    (18, 4, 2500000, 500000), (18, 5, 9000000, 2500000),
    
	(19, 1, 280000000, 70000000), (19, 2, 70000000, 25000000), (19, 3, 25000000, 5000000),
    
    (20, 1, 150000000, 40000000), (20, 2, 40000000, 15000000), (20, 3, 15000000, 4000000),
    (20, 4, 1200000, 300000), (20, 5, 4000000, 1000000), (20, 6, 300000, 50000),
    
	(21, 1, 200000000, 60000000), (21, 2, 50000000, 12000000), (21, 3, 20000000, 5000000), 
    
    (22, 4, 800000, 200000), (22, 6, 100000, 30000), 
    
	(23, 1, 320000000, 90000000), (23, 2, 80000000, 25000000), (23, 3, 30000000, 10000000), 
    (23, 4, 2000000, 600000), (23, 5, 10000000, 3000000),
    
	(24, 1, 200000000, 60000000), (24, 2, 60000000, 20000000), (24, 3, 20000000, 5000000),  
    
	(25, 1, 150000000, 40000000), (25, 2, 35000000, 12000000), 
    (25, 3, 10000000, 2500000), (25, 4, 1000000, 300000), (25, 5, 4000000, 800000), (25, 6, 200000, 50000),
    
    (26, 1, 25000000, 7000000), (26, 2, 12000000, 4000000), (26, 3, 9000000, 3000000),
    
    (27, 4, 700000, 150000), (27, 6, 100000, 20000),
    
    (28, 1, 60000000, 20000000), (28, 2, 30000000, 9000000), (28, 3, 15000000, 4000000),
    (28, 4, 1500000, 300000), (28, 5, 1000000, 200000),
    
    (29, 1, 30000000, 8000000), (29, 2, 15000000, 4000000), (29, 3, 8000000, 2000000),
    
    (30, 1, 20000000, 5000000), (30, 2, 10000000, 3000000), (30, 3, 5000000, 1500000),
    (30, 4, 1200000, 400000), (30, 5, 1000000, 300000), (30, 6, 800000, 200000);

