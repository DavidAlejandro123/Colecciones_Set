import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos a la fiesta de los superheroes");

        List<String> superHeroes = new ArrayList<>();
        //List<String> superHeroes = new LinkedList<>();
        //List<String> superHeroes = new Vector<>();

        superHeroes.add("Spiderman");
        superHeroes.add("Batman");
        superHeroes.add("CatWoman");
        superHeroes.add("Hulk");
        superHeroes.add("Superman");
        superHeroes.add("Capitan America");

        //Despues llego tarde nuestro superheroe estrella
        superHeroes.add("Iron Man");

        if(superHeroes.contains("Spiderman")){
            System.out.println("Spiderman esta en la fiesta");    
        }

        System.out.println("Hay un superheroe que ya ceno, ese es "+superHeroes.get(0));
        //superHeroes.remove(3);

        if(!superHeroes.contains("Hulk")){
            System.out.println("Hulk se ha ido de la fiesta");
        }

        //por propiedad de list, permite duplicar elementos
        superHeroes.add("Superman");

        superHeroes.set(6, "Tony Stark");
        System.out.println("Ironman se saca el traje mostrando su verdadera identidad que es: "+superHeroes.get(6));
        if(superHeroes.isEmpty()){
            System.out.println("La fiesta ha terminado, ya no hay superheroes");
        } else{
            System.out.println("Aun quedan "+ superHeroes.size() + " superheroes");
        }

        //Imprime en el mismo orden en que se agregaron los elementos
        System.out.println("Quienes estan aun en la fiesta?");
        for (String superHeroe : superHeroes) {
            System.out.println(superHeroe);
        }
        
    }
}
