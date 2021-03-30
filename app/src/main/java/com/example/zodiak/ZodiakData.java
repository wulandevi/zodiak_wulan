package com.example.zodiak;

import java.util.ArrayList;

public class ZodiakData {
    private static String [] zodiakName ={
            "Capricorn" ,
            "Aquarius" ,
            "Aries" ,
            "Cancer" ,
            "Gemini" ,
            "Leo" ,
            "Libra" ,
            "Pisces" ,
            "Sagitarius" ,
            "Scorpio" ,
            "Taurus" ,
            "Virgo"

    };
    private static String[] zodiakDetail= {
            "Mereka yang memiliki zodiak Capricorn dikenal dengan sifat baik hatinya. Orang berzodiak Capricorn juga dikenal cerdas dan mampu berpikir jernih saat dihadapkan dalam situasi sulit. Zodiak dengan lambang kambing dengan ekor seperti ikan ini juga dikenal mampu mengatur sisi emosional dan materialnya.",
            "Meski direpresentasikan dengan lambang guci yang mengalirkan air, zodiak Aquarius sebenarnya berelemen udara. Seorang Aquarius selalu berusaha untuk mengejar passion dan mereka senang mencoba hal baru.",
            "Zodiak Aries suka menjadi nomor satu. Nggak heran, sih, karena zodiak dengan lambang domba jantan ini adalah zodiak yang pertama. Berani dan ambisius, Aries dikenal tak segan terjun ke berbagai situasi menantang. Mereka juga dikenal sebaga sosok yang rasional dan senang bicara straightforward alias nggak bertele-tele.",
            "Sama seperti air yang bisa terlihat berbeda tergantung pada wadahnya, zodiak Cancer juga dinilai sebagai sosok yang fleksibel. Mereka bisa dengan mudah beradaptasi dalam berbagai situasi. Tak peduli kondisi seperti apa yang ada di hadapan mereka, Cancer selalu menemukan cara untuk menjalani itu semua.",
            "Sebagai zodiak Gemini dengan lambang manusia kembar, Gemini yang memiliki elemen udara sangat mencintai kebebasan dan senang mencoba hal-hal baru. Mereka juga dikenal sebagai komunikator yang baik dan memiliki banyak teman.",
            "Zodiak Leo dengan elemen api ini sangat penuh energi dan itu mereka tularkan pada orang-orang di sekitarnya. Leo dengan lambang singa sang raja hutan, mereka senang menjadi pusat perhatian dan selalu penuh gairah dalam setiap hal yang mereka kerjakan.",
            "Sesuai dengan lambang Libra, yaitu timbangan, zodiak Libra memang menyukai keseimbangan dan kehidupan yang harmonis. Mereka selalu mencoba untuk menciptakan keseimbangan dalam setiap aspek hidupnya.",
            "Zodiak Pisces merupakan zodiak dengan elemen air dan konstelasi terakhir dalam urutan zodiak. Simbol dua ikan yang berenang ke arah yang berlawanan merupakan representasi pemikiran Pisces yang sering terbagi ke dua arah berbeda, antara realita dan fantasi.",
            "Zodiak Sagitarius dengan lambang makhluk mitos centaurus atau manusia setengah kuda ini dikenal sebagai sosok yang kreatif. Sebagai zodiak berelemen api, Sagitarius dikenal sebagai orang yang tak ragu menyuarakan pendapatnya. Mereka juga sosok yang senang petualangan dan cinta kebebasan.",
            "Sebagai zodiak dengan elemen air, Scorpio selalu bisa menempatkan dirinya dalam berbagai situasi. Nggak hanya itu, zodiak Scorpio dengan lambang kalajengking ini dikenal sebagai sosok yang loyal dan sangat menghargai persahabatan.",
            "Zodiak Taurus adalah zodiak dengan eleman tanah yang direpresentasikan oleh simbol banteng. Seorang Taurus sangat menikmati ketenangan dan suka dengan zona nyaman, sehingga jarang berganti-ganti tempat. Mereka juga keras kepala dan kerap tak pikir dua kali saat ambil keputusan.",
            "Zodiak Virgo dikenal sebagai sosok yang perfeksionis. Mereka memiliki pendekatan yang sistematis dan praktikal dalam menjalani hidup. Di satu sisi, virgo juga memiliki sifat yang sensitif dan cenderung misterius."
    };

    private static int[] zodiakImage = {
            R.drawable.capricornus,
            R.drawable.aquarius,
            R.drawable.aries,
            R.drawable.cancer,
            R.drawable.gemini,
            R.drawable.leo,
            R.drawable.libra,
            R.drawable.pisces,
            R.drawable.sagittarius,
            R.drawable.scorpio,
            R.drawable.taurus,
            R.drawable.virgo

    };

static ArrayList<Zodiak> getListData(){
    ArrayList<Zodiak> list = new ArrayList<>();
    for (int position = 0; position <zodiakName.length; position++) {
        Zodiak zodiak = new Zodiak();
        zodiak.setName(zodiakName[position]);
        zodiak.setDetail(zodiakDetail[position]);
        zodiak.setPhoto(zodiakImage[position]);
        list.add(zodiak);
    }
    return list;
}
}
