
Soal 1 – Class dan Object

Perbedaan antara class dan object terletak pada konsep dan penerapannya dalam pemrograman berorientasi objek. 
Class merupakan cetak biru atau template yang mendefinisikan atribut dan perilaku suatu entitas, sedangkan object adalah instansiasi nyata dari class tersebut. 
Misalnya, Course adalah sebuah class yang mendefinisikan atribut seperti courseName, credit, dan instructorName. 
Sementara itu, Course c1 = new Course("OOP", 3, "Mr. Budi"); adalah contoh object yang merepresentasikan satu mata kuliah spesifik.

Soal 2 – Encapsulation

Encapsulation penting karena berfungsi melindungi data dari akses langsung yang tidak diinginkan dan memastikan integritas data tetap terjaga. 
Dengan membuat atribut credit bersifat privat dan menambahkan validasi pada setter, program dapat mencegah nilai negatif yang tidak logis. 
Prinsip ini memungkinkan pengembang mengontrol bagaimana data dimodifikasi, menjaga konsistensi sistem, serta meningkatkan keamanan dan kemudahan pemeliharaan kode.

Soal 3 – Relationship antar Class

Hubungan aggregation antara class Student dan Course menunjukkan bahwa seorang mahasiswa (Student)
dapat mengambil beberapa mata kuliah, tetapi setiap mata kuliah tetap dapat eksis tanpa bergantung pada objek Student. 
Dengan kata lain, relasi ini bersifat “memiliki” namun tidak “bergantung sepenuhnya.” 
Model ini menggambarkan hubungan yang fleksibel antar objek, sering digunakan dalam desain sistem akademik atau manajemen data yang melibatkan entitas saling terkait.

Soal 4 – Inheritance dan Polymorphism

Inheritance memungkinkan sebuah class mewarisi atribut dan metode dari class lain untuk menghindari duplikasi kode dan memperluas fungsionalitas. 
Dalam kasus ini, Person berperan sebagai superclass, sementara Student dan Lecturer adalah subclass yang mewarisi dan menyesuaikan metode introduce(). 
Polymorphism terjadi ketika metode yang sama (introduce()) dapat memiliki perilaku berbeda tergantung objek yang memanggilnya. 
Hal ini mencerminkan prinsip dinamis dalam OOP yang meningkatkan fleksibilitas dan efisiensi kode.

Soal 5 – Abstract Class & Interface

Abstract class digunakan ketika sebuah kelas memiliki perilaku umum tetapi tidak dapat diinstansiasi secara langsung, serta memungkinkan adanya implementasi sebagian. 
Sementara itu, interface digunakan untuk mendefinisikan kontrak perilaku tanpa implementasi, agar kelas lain dapat mengimplementasikannya dengan cara masing-masing. 
Abstract class lebih tepat digunakan ketika terdapat kesamaan logika antar kelas turunan, 
sedangkan interface lebih sesuai untuk mendefinisikan kemampuan umum yang dapat diterapkan lintas hierarki kelas.
