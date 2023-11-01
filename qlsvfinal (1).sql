use master
go
if db_id('qlsv') is not null
drop database qlsv
go

create database qlsv
go
use qlsv
go

create table monhoc
(
	id int identity(1,1) primary key,
	tenmon nvarchar(30) not null
)
go

create table giaovien
(
	id int identity(1,1) primary key,
	hoten nvarchar(30) not null,
	gioitinh bit not null,
	ngaysinh datetime not null,
	diachi nvarchar(100) not null,
	sdt varchar(15) not null,
	email varchar(100) not null
)
go

create table nienkhoa
(
	id int identity(1,1) primary key,
	tennienkhoa nvarchar(30) not null,
	nambatdau int not null,
	namketthuc int not null
)
go

create table lophoc
(
	id int identity(1,1) primary key,
	tenlop nvarchar(30) not null,
	gvcn int not null foreign key references giaovien (id)
)
go

create table sinhvien
(
	id int identity(1,1) primary key,
	hoten nvarchar(30) not null,
	gioitinh bit not null,
	ngaysinh datetime not null,
	nienkhoa int foreign key references nienkhoa (id),
	lop int foreign key references lophoc (id),
	email varchar(100) not null
)
go

create table diem
(
	sinhvien int foreign key references sinhvien (id),
	monhoc int foreign key references monhoc (id),
	diem float not null,

	primary key (sinhvien, monhoc)
)
go

create table taikhoan
(
	tk varchar(30) primary key,
	mk varchar(30)
)
go

insert into taikhoan values ('admin','123')
go

insert into monhoc values
(N'Môn học 1'),
(N'Môn học 2'),
(N'Môn học 3'),
(N'Môn học 4'),
(N'Môn học 5'),
(N'Môn học 6'),
(N'Môn học 7'),
(N'Môn học 8'),
(N'Môn học 9'),
(N'Môn học 10')
go

insert into nienkhoa values
(N'Niên khóa 1',2000,2001),
(N'Niên khóa 2',2000,2001),
(N'Niên khóa 3',2000,2001),
(N'Niên khóa 4',2000,2001),
(N'Niên khóa 5',2000,2001),
(N'Niên khóa 6',2000,2001),
(N'Niên khóa 7',2000,2001),
(N'Niên khóa 8',2000,2001),
(N'Niên khóa 9',2000,2001),
(N'Niên khóa 10',2000,2001)
go

insert into giaovien values
(N'Giáo viên 1',0,GETDATE(),N'Hà Nội','00000','mail@mail.com'),
(N'Giáo viên 2',0,GETDATE(),N'Hà Nội','00000','mail@mail.com'),
(N'Giáo viên 3',0,GETDATE(),N'Hà Nội','00000','mail@mail.com'),
(N'Giáo viên 4',0,GETDATE(),N'Hà Nội','00000','mail@mail.com'),
(N'Giáo viên 5',0,GETDATE(),N'Hà Nội','00000','mail@mail.com'),
(N'Giáo viên 6',0,GETDATE(),N'Hà Nội','00000','mail@mail.com'),
(N'Giáo viên 7',0,GETDATE(),N'Hà Nội','00000','mail@mail.com'),
(N'Giáo viên 8',0,GETDATE(),N'Hà Nội','00000','mail@mail.com'),
(N'Giáo viên 9',0,GETDATE(),N'Hà Nội','00000','mail@mail.com'),
(N'Giáo viên 10',0,GETDATE(),N'Hà Nội','00000','mail@mail.com')
go

insert into lophoc values
(N'Lớp 1',10),
(N'Lớp 2',9),
(N'Lớp 3',8),
(N'Lớp 4',7),
(N'Lớp 5',6),
(N'Lớp 6',5),
(N'Lớp 7',4),
(N'Lớp 8',3),
(N'Lớp 9',2),
(N'Lớp 10',1)
go

insert into sinhvien values
(N'Sinh viên 1',0,GETDATE(),1,1,'mail@mail.mail'),
(N'Sinh viên 2',0,GETDATE(),1,1,'mail@mail.mail'),
(N'Sinh viên 3',0,GETDATE(),1,1,'mail@mail.mail'),
(N'Sinh viên 4',0,GETDATE(),1,1,'mail@mail.mail'),
(N'Sinh viên 5',0,GETDATE(),1,1,'mail@mail.mail'),
(N'Sinh viên 6',0,GETDATE(),1,1,'mail@mail.mail'),
(N'Sinh viên 7',0,GETDATE(),1,1,'mail@mail.mail'),
(N'Sinh viên 8',0,GETDATE(),1,1,'mail@mail.mail'),
(N'Sinh viên 9',0,GETDATE(),1,1,'mail@mail.mail'),
(N'Sinh viên 10',0,GETDATE(),1,1,'mail@mail.mail')

select*from sinhvien