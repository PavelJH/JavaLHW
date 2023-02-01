package lection2;

public class XO {
    int arr [][] = new int [3][3];
    //игровое поле 3 на 3 в виде двумерного массива
            int k = 0;
   
        //тут просто заполняем его и выводим для игрока/игроков на экран заполненные игровые поля
            public void start(){
        System.out.println("Выберите свободное поле");
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            k++;
            arr[i][j] = (char) k;
        }
    }
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    }
//тут по замыслу игрок вводит число, если оно не входит в 1-9, выводим хоть что-то...
    public int move(){
        int a;
        Scanner sc = new Scanner(System.in);
 
//пробовал и не закрывать сканнер       
        a = sc.nextInt();
        sc.close();
        if(a<1&&a>9){
            return 00000000;
        }else
        return a;
    }
//ну и тут проверяем, на совпадение числа, если вводимое число совпадает с 1-9, то в данную клетку закидываем 0 или 100(смотря какой игрок сделал ход-на второго игрока такой же метод есть), [B]но сюда уже программа не доходит, застряет на сканнере и продолжает хотеть ввода чисел/цифр...[/B]
    public void playPlayerOne(){
        //int a;
        //a= sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                k++;
                arr[i][j] = k;
                if(move()==arr[i][j]){
                    arr[i][j]=0;
                }
            }
        }
        System.out.println("Игровое поле выглядит так:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
}
