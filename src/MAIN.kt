import java.util.*
data class Player(var name : String = "BOGDAN", var hp : Int = 100, var nextLvlXp : Int = 100, var xp : Int = 50, var MaxHp : Int = 100) {
    private var BackPackSize = 100;
    private var CurrentStore = 10;

    fun PlayerDeath() {
        println("You died!")
        xp /= 2
        hp = (MaxHp.toDouble() * 0.05).toInt()
    }

    fun dropThing(itemsize: Int) {
        if (CurrentStore - itemsize < 0)
            CurrentStore = 0;
        else
            CurrentStore -= itemsize;
    }

    fun storeThing(itemsize: Int) {
        if (CurrentStore + itemsize < BackPackSize)
            CurrentStore += itemsize;
        else
            println("Backpack is full!");
    }
}
fun main(args: Array<String>) {

    print("Input variable:");
    val input = readLine();
    if(input != null) print(input.toDouble());
    print("\n");

    print("Input name:");
    val Name = readLine();

    print("Input surname:");
    val SurName = readLine();

    if(SurName  != null && Name  != null) print(Name + " " + SurName);
    print("\n");

    print("Length:");
    val len = readLine();
    print("Width:");
    val wid = readLine();
    if(wid  != null && len != null) print(square(len.toDouble(), wid.toDouble()));
    print("\n");

    print("x1:");
    val x1 = readLine();
    print("y1:");
    val y1 = readLine();
    print("x2:");
    val x2 = readLine();
    print("y2:");
    val y2 = readLine();

    if(y2 != null && x2 != null && y1 != null && x1 != null){
        print(Math.sqrt(Math.pow(y2.toDouble() - y1.toDouble(), 2.0) +
                Math.pow(x2.toDouble() - x1.toDouble(), 2.0)));
    }
    print("\n");

    print(calcTaxes(sum(239.0, 30.0), 0.13));
    print("\n");

    print(calcTaxesConstanta(100.9));
    print("\n");

    print(calcTaxes(args[0].toDouble(), 0.13));
    print("\n");

    var le = 0.0;
    var t = 0;
    for(temp in args) {
        le += temp.toDouble();
        t++;
    }
    println(le / t);

    var array = Array( 10){i -> Random().nextInt() % 100};
    for(le in array) println(le);

    var arra = Array( 3){i -> Array( 3){i -> Random().nextInt() % 100}};

    for(i in arra) {
        for (kek in i)
            print(kek.toString() + " ");
        print("\n");
    }
    for(i in 0 until arra.size) {
        for (kek in arra[i].size downTo 1)
            print(arra[kek - 1][i].toString() + " ");
        print("\n");
    }
    
    var string = "Смешанные чувства теснятся в груди моей, когда я приступаю к описанию этой экспедиции, принесшей мне больше, нежели я мог надеяться. Отправляясь в путь с Земли, я назначил себе целью достижение невероятно далекой планеты в созвездии Краба, Зазьявы, слава о которой разносится по всей космической пустоте благодаря тому, что она подарила Вселенной одну из наиболее выдающихся ее личностей, Учителя Ох. Не так на самом деле зовут сего блестящего мыслителя, я же пользуюсь этим именем, ибо ни один земной язык не в состоянии передать его иным образом. Ребенку, рождающемуся на Зазьяве, вместе с необыкновенно длинным, по нашим представлениям, именем присваивают несметное множество титулов и отличий.\n" +
            "Когда в свое время Учитель Ох пришел в мир, его нарекли именем Гридипидагититоситипопокартуртегвауана-топочтоэтотам. Он получил титулы Златотканого Оплота Бытия, Доктора Совершенной Кротости, Светлой Вероятностной Всесторонности и т.д. и т.п. По мере того как он мужал и учился, каждый год его лишали одного титула и частички имени, а поскольку способности он выказывал необычайные, уже на тридцать третьем году жизни у него отобрали последнее отличие, спустя же еще два года у него вообще не осталось титулов, а имя его обозначалось одной только – да к тому же немой – буквой зазьявского алфавита: «придыхание блаженства», то есть особого рода подавленный вздох, который издают от избытка уважения и наслаждения.";
    println(string.split(" ").size - 2);
    println(string.split(".").size);

    var KekClass = Player();
    println(KekClass);
    KekClass.PlayerDeath();
    println(KekClass);
    print("kek");
}

fun sum(int1: Double, int2: Double): Double = int1 + int2

fun square(len: Double, wid: Double): Double = len * wid

fun calcTaxes(value: Double, taxP: Double): Double {
    return value *  taxP;
}

fun calcTaxesConstanta(value: Double, taxP: Double = 0.15): Double {
    return value *  taxP;
}
