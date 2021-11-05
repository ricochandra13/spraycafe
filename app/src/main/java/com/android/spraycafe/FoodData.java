package com.android.spraycafe;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Batagor",
                "Batagor terdiri dari adonan bakso ikan tenggiri yang diisi ke dalam tahu dan kulit pangsit.",
                3000, context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Black Salad",
                "Black salad merupakan makanan 5 sehat 4 sempurna yang terdiri dari kalori dan buah buahan yang bagus untuk pertumbuhan dan kesehatan anak",
                7000, context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Cappuchino",
                "Minuman ini adalah minuman terbaik bagi kalian yang men jomblo dan tidak bisa tidur, dengan meminum cappuchino energi dan rasa kalian men jomblo akan menjiwai menemani malammu",
                4000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Cheesecake",
                "Kue ini merupakan keu ter enak abad ini dimana, kue ini dicampur dengan keju yang sangat enak untuk dimakan dengan segelas kopi, dan duduk di tepi senja",
                15000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Cireng",
                "cireng, makanan ini merupakan salah satu jajanan lain yang berbahan dasar tepung kanji. Cireng berasal dari kata 'aci' yang 'digoreng'. Hampir sama dengan cilok yang berasal dari 'aci' yang 'dicolok'. Jajanan dengan bahan dasar tepung aci atau tepung kanji memang cukup fenomenal.",
                10000, context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Donat",
                "Donat adalah penganan yang digoreng, dibuat dari adonan tepung terigu, gula, telur, dan mentega. Donat yang paling umum adalah donat berbentuk cincin dengan lubang di tengah dan donat berbentuk bundar dengan isian manis, seperti selai, jelly, krim, dan custard.",
                3000, context.getDrawable(R.drawable.donut)));
        list.add(new Food("Kopi Hitam",
                "Berbeda dengan Cappuchino, kopi hitam ini membuat kamu tidak tidur 3 hari 3 malam tanpa mengantuk sedikit pun",
                2000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Mie Goreng",
                "Makanan ini cocok untuk kamu yang merantau dan anak kost, karena mie goreng ini tidak hanya enak, mie goreng ini tergolong makanan paling murah yang membuat kenyang dan enak sekali",
                6000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Nasi Goreng",
                "Nasi Goreng merupakan makanan yang dimana nasi nya di goreng lagi lalu di campur dengan bumbu bumbu nasi goreng yang membuat nasi tersebut terasa harum dan wangi, begitupun rasanya begitu nikmat, adapun topping yang diberikan nasi goreng antara lain telur dan sosis, dan harganya terjangkau",
                13000, context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Sparkling Tea",
                "Minuman ini sama seperti minuman tea pada umumnya hanya saja bahasanya menggunakan bahasa inggris yang artinya berkilau, karena kami menjual nama maka dari itu minuman ini mahal",
                30000, context.getDrawable(R.drawable.sparkling_tea)));
        return list;
    }
}
