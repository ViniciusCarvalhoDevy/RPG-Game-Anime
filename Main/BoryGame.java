package TestJogoDinamico;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        int dado1=0;
        int dado2=0;
        int cont= 0;
        int Fim=0;
        String op = "";
        Integer opcao=0;
        int m=0,s=0; 
        BoryGame esco = new BoryGame();
        Scanner sc = new Scanner (System.in);
       Personagens [] j = new Personagens[4];
    for(cont=0;cont <2;cont++){
        System.out.println("|Escolha o Personegem!|");
        System.out.println("\r\n| 1 - Meliodas|\r\n| 2 - Scannor |\r\n| 3 - King    |");
        opcao = sc.nextInt();          
      switch (opcao)
      {
          case 1:
  
          m =1;
          j[1] = new Personagens(1);       
          j[1].setnome("Meliodas");;
          j[1].setPoder("Trevas");
          j[1].setRaca("Demônio");
          j[1].setVida(150);
          j[1].setAtaque("Chamas Do Inverno","Mil Cortes Divinos","Devorador de Almar",0);
          System.out.println("|"+j[1].getNome()+" Criado! |");
          j[1].info();
          
          break;
          case 2:
          s = 2;
          j[2] = new Personagens(0);
          j[2].setnome("Scanor");
          j[2].setPoder("Sushine");
          j[2].setRaca("Humano Abençoado");
          j[2].setVida(120);
          j[2].setAtaque("Sol Cruel ","Chama Do Orgulho","Espada Sagrada Scannor",0);
          System.out.println("|"+j[2].getNome()+" Criado! |");
          j[2].info();
      
          break;
          case 3:
           if(m ==1){
            s =3;
           }else {m =3;}
            
          j[3] = new Personagens(0);
          j[3].setnome("King");
          j[3].setPoder("Desastre");
          j[3].setRaca("Fada");
          j[3].setVida(140);
          j[3].setAtaque("Status Promotion","Chastiefol Primeira Forma","Chastiefol Verdadeira Forma",0);
          System.out.println("|"+j[3].getNome()+" Criado! |");
          j[3].info();
          break;
          case 4: 
            j[4] = new Personagens(0);
            j[4].setnome("Ban");
            j[4].setPoder("Caçada");
            j[4].setRaca("Humano");
            j[4].setVida(145);
            j[4].setAtaque("Caçada da Raposa","Assault Hunt","Festival Da Caçar",0);
            System.out.println("|"+j[4].getNome()+" Criado! |");
            j[4].info();
          break;
      }
    }
     while (Fim != 2){

      if(opcao !=0){
        System.out.println("\r\n| O Dado será Jogado, quem tirar o maior numero joga!"); 
        System.out.println("\r\nRolar Dado "+j[m].getNome()+"?");
        op = sc.next();
        System.out.println("\r\n"+j[m].getNome()+" jogando Dado...");
         dado1 = new SecureRandom().nextInt(6) + 1;
        System.out.println("\r\n|Valor: "+dado1+"|");
        System.out.println("\r\nRolar Dado "+j[s].getNome());
        op = sc.next();
        System.out.println("\r\n"+j[s].getNome()+" joga Dado..."); 
         dado2 = new Random().nextInt(6) + 1;
        System.out.println("|Valor: "+dado2+"|");
      }
    if (dado1 > dado2){
   
        System.out.println("\r\n"+j[m].getNome()+" Pode Atacar!"); 
        System.out.println("Qual será o ataque "+j[m].getNome()+"?\r\n");
        for (cont =1; cont <4;cont++){
        System.out.println(cont+" - "+j[m].getAtaque(cont));
        }
        int Ataq = sc.nextInt();
                j[m].FrasesAtaques(m, Ataq);
                j[m].setAtaqueacao(Ataq,m,j[s]);
                j[m].setPontos(j[m].getDano());
                System.out.println("||Vida de "+j[s].getNome()+" : "+j[s].getVida()+"||");
                System.out.println("\r\nSeus Dados:");
                j[m].info();
    
        }else if (dado1 < dado2){  
                System.out.println("\r\n"+j[s].getNome()+" Pode Atacar!"); 
                System.out.println("\r\nQual será o ataque "+j[s].getNome()+"\r\n");
                for (cont =1; cont <4;cont++){
                System.out.println(cont+" - "+j[s].getAtaque(cont));
                }
                  int Ataq = sc.nextInt();
                  j[s].FrasesAtaques(s, Ataq);
                    j[s].setAtaqueacao(Ataq,s,j[m]);
                    j[s].setPontos(j[s].getDano());
                    System.out.println("Vida de "+j[m].getNome()+" : "+j[m].getVida());
                    j[s].info();          
        }else if (dado1 == dado2){
                System.out.println("\r\n Valor de Dados Iguais! Jogue-os Novamente!");
              }
              if (j[m].getVida() <= 0){
                System.out.println("\r\n"+j[m].getNome()+" Perdeu o Jogo!");
                j[m].setMorto();
                Fim++;
                Fim++;
                j[m].info();
              }else if (j[s].getVida() <= 0){
                System.out.println("\r\n"+j[s].getNome()+" Perdeu o Jogo!");
                j[s].setMorto();
                Fim++;
                Fim++;
                j[s].info();
              }

        }//While
       
}
}
