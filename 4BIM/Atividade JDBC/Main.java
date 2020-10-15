import univille.poo.jdbc.PessoaDAO;
import univille.poo.jdbc.model.Pessoa;



public class Main {

    public static void main(String[] args) {
    	/*
    	Pessoa p = new Pessoa();
    	p.setNome("JOAO");
    	p.setSobrenome("FREDERICO");
    	p.setIdade(62);
    	p.setId(1);
        PessoaDAO dao = new PessoaDAO();
        
        

        dao.updateById(p);
        System.out.println(p);
    
*/
    	/*
    	Pessoa p = new Pessoa();
    	p.setNome("LEANDERSON");
    	p.setSobrenome("ANDRE");
    	p.setIdade(28);
        PessoaDAO dao = new PessoaDAO();
        
        

        dao.insert(p);
        System.out.println(p);
        */
    	
    	/*
    	Pessoa p = new Pessoa();
    	p.setId(2);
        PessoaDAO dao = new PessoaDAO();
        
        

        dao.deleteById(p);
        System.out.println(p);
        */
    	
    	Pessoa p = new Pessoa();
    	p.setNome("NEYMAR");
    	p.setSobrenome("JR");
    	p.setIdade(29);
        PessoaDAO dao = new PessoaDAO();
        
        dao.insert(p);
        System.out.println(p);
        
        System.out.println(dao.getAll());
        
}
}
