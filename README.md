# Designing an OOO Driver Transformation Simulator

Kelompok 4:
Beryl Christopher Robert - 2086022510026
Jevlin Misael Chandra - 208622510023
Reno Ricardo Siahaya - 2086022510028
Jonathan Adriel Livanno - 2086022510002

How To Run and Compile the program
    1. pastikan directorynya sudah benar dengan melakukan cd "E:\IMT\Semester 2\OOP\Tugas Week 9"
    2. cara compile javac tugas/week9/*.java
    3, run java tugas.week9.Main

Key Features
1. Program ini bisa menerima inputan berupa medal yang ada dan sudah kita sediakan medalnya bisa di input sesuai kemauan user dan tidak ada di batasi saat menginput
2. Namun akan di cek saat di lakukan scan bila dilakukan scan dan slot nya itu tidak terisi atau slot dari ketiga medal itu ada medal yang double misalnya head head arm atau leg arm arm itu ada slot medal yang dobel dan tidak memenuhi aturan bahwa harus ada head, arm, dan leg
3. kami juga menyediakan spesial combo yang bila warnanya sama atau sudah terdiri dari rumus rumus medal yang kita sediakan total ada 8 spesial kombo yang bisa di scan lagi agar bisa mendapatkan ultimate nya atau spesial movenya
4. bila ingin mengeluarkan medal user bisa memilih eject dan memilih medal slot ke berapa yang ingin di keluarkan penentuan slot medal tergantung urutan inputnya bila medal pertama yang masuk adalah medal head maka saat mengeluarkan dan memilih index 1 maka yang akan keluar dari slot medalnya adalah medal head
5. melakukan scanning charge atau ultimate bisa di lakukan bila kondisi terpenuhi yaitu bila melakukan pengscanan ulang di medal sebelumnya syarat medalnya itu harus ada dalam special combo

Class yang mendemonstrasikan Collections, Generic dan Exception Handling
A. Collections
1. Collection di ComboCatalogue kita pakai Arraylist untuk menyimpan comborulenya atau rumus kombonya kami menggunakan arraylist agar lebih efisien
2. engine.TransformationEngine menggunakan List dan metode tujuannya itu biar bisa melakukan pengecekan yang tidak berpatokan pada urutan input slot

B. Generic
1. Kita menggunakan <T> agar mudah saat memasukkan sebuah objek ke dalam list tanpa harus kita menentukan tipe datanya

C. Exception
1. exception.InvalidMedalException Kita menggunakan exception ini agar bila user melakukan kesalahan input misaknya medal kurang dari 3 atau medal yang di kasih masuk dari ketiganya ada yang double maka akan di lempar exception
2. Main.java (Try-Catch Blocks): Menggunakan blok try-catch untuk menangani, yang pertama untuk menangani character yang di masukkan saat memilih slot dan saat memasukkan nama medal yang tidak ada atau sesuai dengan sistem