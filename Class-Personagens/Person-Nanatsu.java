package TestJogoDinamico;

public class Personagens {
  //meliodas
 
   //scanor
   private int vezesPS= 0;
    private int vezes1PS= 0;
    private int vezes2PS=0;
   private int fraq=0;


        private int num;  //V
        private int vida; //V
        private String nome; //V
        private String poder; //V
        private String raca; //V
        private int pontos;
        private int forca;
        private String ataque []={"","","",""};
        private Boolean vivo;
        private Boolean morto;
        private int dano;
        public Personagens(int num){
        this.num = num;
        this.vivo = true;
        this.morto = false;
        
        }
    
        public int getVida() {
            return this.vida;
          }
    
          public void setVida(int v) {
            this.vida =v;
          }
          public String getNome() {
            return this.nome;
          }
          
          public void setnome(String nome) {
              this.nome = nome;
            }
          
        
          public Boolean getVivo() {
            return this.vivo;
          }
          public Boolean getMorto() {
            return this.morto;
          }
    
          public void setMorto() {
            if(this.vida == 0){
                this.morto = true;
                this.vivo = false;
            }
          }
          public String getPoder() {
            return this.poder;
          }
    
          public void setPoder(String p) {
            this.poder = p;
          }
    
          public String getRaca() {
            return this.raca;
          }
    
          public void setRaca(String r) {
            this.raca = r;
          }
    
        public  int  getPontos(){
            return this.pontos;
        }
        public void setPontos(int dano){
           this.dano = dano;
          if (this.dano <= 10 && this.dano >= 0) {
            this.pontos += 20;
          } else if (this.dano <= 30) {
            this.pontos += 35;
          } else if (this.dano <= 50) {
            this.pontos += 55;
          } else if (this.dano > 70) {
            this.pontos += 75;
          }else if (this.dano > 85) {
            this.pontos += 90;
        }else if (this.dano > 90 && this.dano <=100){ 
          this.pontos += 100;
        }
        }
    
        public String getAtaque(int i){
           return this.ataque[i];
            
        }
        public void setAtaque(String at,String at1,String at2,int i){
          i=1;
          this.ataque[i] = at;
          i++;
          this.ataque[i] = at1;
          i++;
          this.ataque[i] = at2;
            
        }
        public  void FrasesAtaques(int tipo, int num) {
          if(tipo == 1 &&  this.vida <= 15){
            System.out.print("Ver Sua Face Mudar de Esperança Para Desespero...");
            System.out.print("E Um Prazer Enorme Para mim...\r\n");
          }else if(tipo == 2 &&  this.vida <= 15){
            //System.out.print("Ora, Ora, Ora");
            System.out.print("Eu me Chamo Scanor...");
            System.out.print("Guarde Na Memória Antes De Morrer...\r\n");
          }else if(tipo == 2 && this.forca >= 6 && this.fraq < 2 ){
            System.out.print("Ora, Ora, Ora...");
            System.out.print("Deixou Uma Moeda Cair No Chão...\r\n");
          }else if(tipo == 3 && this.vida <= 15) {
            System.out.print("Comece a Rezar...");
          }else if(tipo == 4 && this.vida <= 15 && num ==3 ) {
            System.out.print("Por Que Não Morre Logo...");
            System.out.print("Ja Estou Ficando Entediado...\r\n");
          }
        }
        public void setAtaqueacao(int numAtaque, int tipoPerson, Personagens inimigo){
            int f=0;
          switch (tipoPerson){
                case 1:
                    if (numAtaque == 1){
                        inimigo.setDano(11);
                        
                        this.dano = getDano();
                    }else if( numAtaque == 2 ){
                        inimigo.setDano(15);
                       
                        this.dano = getDano();
                    }else if( numAtaque == 3  ){
                        inimigo.setDano(22); 
                        
                        this.dano = getDano();                   
                    }
                break;
                case 2: 
                if (numAtaque == 1 && forca < 6 && this.fraq >= 0){
                    inimigo.setDano(11);
                    vezes2PS++;
                    this.forca +=vezes2PS;
                    this.dano = getDano();

                }else if( numAtaque == 2 ){
                    inimigo.setDano(15);
                    this.vezesPS++;
                    this.forca +=vezesPS;
                    this.dano = getDano();
                }else if( numAtaque == 3  ){
                    inimigo.setDano(21); 
                    this.vezes1PS++;   
                    this.forca +=vezes1PS;   
                    this.dano = getDano();                
                }
                
                if (numAtaque == 1 && this.forca >= 6 && this.fraq < 3){
                    inimigo.setDano(18);
                    this.dano = getDano();
                    this.fraq++;
                }else if (numAtaque == 2 && this.forca >= 6 && this.fraq < 3){
                  inimigo.setDano(20);
                  this.dano = getDano();
                  this.fraq++;
              }else if (numAtaque == 3 && this.forca >= 6 && this.fraq < 3){
                inimigo.setDano(25);
                this.dano = getDano();
                this.fraq++;
            }
                break;
                case 3:
                if (numAtaque == 1  ){
                  inimigo.setDano(11);     
                  this.dano = getDano();

              }else if( numAtaque == 2 ){
                  inimigo.setDano(16);        
                  this.dano = getDano();
              }else if( numAtaque == 3  ){
                  inimigo.setDano(23);  
                  this.dano = getDano();                
              }
                break;
                case 4:
                    if (numAtaque == 1 ){      
                  inimigo.setDano(11 +f);
                  this.dano = getDano();

              }else if( numAtaque == 2 ){
                  inimigo.setDano(16+2);
                  this.dano = getDano();
              }else if( numAtaque == 3){
                  inimigo.setDano(20); 
                  this.dano = getDano();    
                  if(numAtaque == 3 && f < 11){
                  f+=2;    
                          
              }  
            }
                break; 
             }
                
            }
        
       
        public void setDano(int d) {
          this.vida -= d;
          this.dano += d;
        }
        public int getDano() {
          return this.dano;
        }
        public void info(){
          System.out.println("--------------------------------------");
          System.out.println("Nome do Personagem: "+getNome());
          System.out.println("Raça: "+getRaca());
          System.out.println("Vida: "+getVida());
          System.out.println("Poder: "+getPoder());
          System.out.println("Pontos: "+getPontos());
          System.out.printf("Vivo: ");
          System.out.println(getVivo() ? "Sim":"Não");
          System.out.println("--------------------------------------");
          
    
        }
        
        }
