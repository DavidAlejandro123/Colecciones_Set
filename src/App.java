
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos a la fiesta de los superheroes");

        Set<String> superHeroes = new TreeSet<>();

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

        superHeroes.remove("Hulk");

        if(!superHeroes.contains("Hulk")){
            System.out.println("Hulk se ha ido de la fiesta");
        }

        //por propiedad de set, ya no agrega superman porque no permite elementos duplicados
        superHeroes.add("Superman");

        if(superHeroes.isEmpty()){
            System.out.println("La fiesta ha terminado, ya no hay superheroes");
        } else{
            System.out.println("Aun quedan "+ superHeroes.size() + " superheroes");
        }

        //hashSet no guarda en un orden especifico (podemos asignar), imprime en orden alfabetico
        System.out.println("Quienes estan aun en la fiesta?");
        for (String superHeroe : superHeroes) {
            System.out.println(superHeroe);
        }
        
    }
}
