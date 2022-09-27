/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.Frankie.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.Frankie.entidades.Ingredinte;
import mx.itson.Frankie.entidades.Receta;
import mx.itson.Frankie.enumeradores.Dificultad;

/**
 *
 * @author alumnog
 */
public class Main {

    public static void main(String[] args) {
        
    Receta receta = new Receta();
    receta.setNombre("Frankie Brownie");
    receta.setDescripcion("Hornea una receta de FRANKIE BROWNIES con leche condensada LA LECHERA para este Halloween y ofrécelas en tu reunión, con tus amigos o familia.");
    receta.setNumeroPorciones(6);
    receta.setDuracion(62);
    List<Ingredinte> ingredientes = new ArrayList<>();
    
    Ingredinte ingrediente1 = new Ingredinte();
    ingrediente1.setNombre("1 Caja de Harina para brownies de chocolate");
    Ingredinte ingrediente2 = new Ingredinte();
    ingrediente2.setNombre("3 cucharadas de agua");
    ingredientes.add(ingrediente1);
    ingredientes.add(ingrediente2);
    
    receta.setIngredientes(ingredientes);
    // Agregar pasos
    
    
    receta.setDificultad(Dificultad.LEGENDARIO);
    
    
    
   
    
        
    }
    
}
