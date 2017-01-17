import java.util.ArrayList;
 
public class Fatec {
 
                private ArrayList<Pessoa> pessoas;
               
                public Fatec(){
                        pessoas = new ArrayList<Pessoa>();
                }
               
                public static void main(String[] args){
                        Fatec f = new Fatec();
                       
                       
                       
                }
               
                public void cadastra(Pessoa p){
                        pessoas.add(p);
                       
                }
                public void listaPessoa(){
                        for( Pessoa p: pessoas){
                                System.out.println(p.getNome() + " " + p.getPapel() + " ");
                                if(p.getClass().toString().equals("class Aluno")){ //getClass revela a qual  classe pertencente a herança
                                        //if (p instanceof Aluno){  
                                        //      ...
                                        //}
                                       
                                        Aluno temp = (Aluno)p; //atribuindo p convertido à origem( Aluno )
                                        System.out.println(temp.getMatricula());
                                }
                                else{
                                        System.out.println();
                                       
                                }
                        }
                }
 
}
 
public abstract class Pessoa {
        private String nome;
        private String email;
        private String cpf;
               
        public String getCpf() {
                return cpf;
        }
 
        public void setCpf(String cpf) {
                this.cpf = cpf;
        }
 
        public Pessoa(String n){
                nome = n;
        }
 
        public String getNome() {
                return nome;
        }
 
 
        public void setNome(String nome) {
                this.nome = nome;
        }
 
 
        public String getEmail() {
                return email;
        }
 
 
        public void setEmail(String email) {
                this.email = email;
        }
       
        public abstract String getPapel();
 
 
}
 
 
public class Aluno extends Pessoa {
        private int matricula;
        public Aluno(String n, int m ){
                super(n);
                matricula = m;
        }
 
 
        public int getMatricula() {
                return matricula;
        }
 
 
        public void setMatricula(int matricula) {
                this.matricula = matricula;
        }
 
 
        public String getPapel() {
 
                return "Aluno";
        }
 
 
}
 
 
 
public class Professor extends Pessoa {
 
        public Professor(String n){
                super(n);
        }
        public String getPapel() {
 
                return "Professor";
        }
 
 
}
