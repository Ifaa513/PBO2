Software Developer Program


Program ini merupakan representasi sederhana dari berbagai jenis software developer menggunakan pendekatan inheritance (pewarisan) dalam pemrograman berorientasi objek (OOP). Ada empat jenis developer yang diimplementasikan dalam program ini:

FrontEnd Developer; BackEnd Developer; UI/UX Designer; FullStack Developer

Masing-masing jenis developer memiliki metode dan atribut yang mencerminkan keahlian, proyek, teknologi, serta peran yang mereka lakukan dalam sebuah proyek perangkat lunak.

Struktur Kelas

SoftwareDeveloper: Kelas induk (superclass) yang menjadi dasar untuk kelas-kelas pengembang lain. Kelas ini berisi atribut umum seperti nama, tahunPengalaman, dan proyekPenting. Juga memiliki metode koding() dan debugging() yang dapat dipanggil oleh semua subclass.

FrontEnd: Subclass dari SoftwareDeveloper yang berfokus pada pengembangan antarmuka pengguna (UI). Memiliki atribut tambahan seperti teknologi dan designTool.

BackEnd: Subclass dari SoftwareDeveloper yang berfokus pada pengembangan server-side. Memiliki atribut tambahan seperti bahasaPemrograman dan database.

UIUX: Subclass dari SoftwareDeveloper yang berfokus pada desain pengalaman dan antarmuka pengguna. Memiliki atribut seperti jumlahProyekDesign dan sertifikasi.

FullStack: Subclass dari SoftwareDeveloper yang menggabungkan kemampuan front-end dan back-end. Selain mewarisi kemampuan dari SoftwareDeveloper, kelas ini memiliki atribut tambahan seperti jenisLaptop dan metode tambahan untuk tugas-tugas yang kompleks seperti membuatAPI, berinteraksiDenganAPI, dan lainnya.
