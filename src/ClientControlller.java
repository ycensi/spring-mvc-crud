import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class ClientControlller {
	
	 @Autowired  
	 ClientDAO dao;
	
	 // Mapeia Rota para a P�gina de Cria��o de Clientes
	 @RequestMapping("/clientform")
	 public ModelAndView showForm() {
		 return new ModelAndView("clientform", "command", new Client());  
	 }
	 
	 // Salva cliente
	 // Caso o CNPJ n�o esteja cadastrado cria um novo cliente, caso contrario atualiza.
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute Client c) {
		 if(dao.getClientByCnpj(c.getCnpj())!=null) {
			 dao.update(c);
		 }
		 else {
			 dao.save(c);
		 }
		 return new ModelAndView("redirect:/clients");
	 }
	 
	 // Mapeia Rota para a P�gina de Listagem de Clientes.
	 @RequestMapping("/clients") 
	 public ModelAndView viewClients() {
		 List<Client> clients = dao.getClients();
		 return new ModelAndView("clients","clients",clients);
	 }
	 
	 // Mapeia Rota para a P�gina de Altera��o de clientes.
	 @RequestMapping(value="/editclient/{cnpj}")
	 public ModelAndView edit(@PathVariable String cnpj) {
		 Client c = dao.getClientByCnpj(cnpj);
		 return new ModelAndView("editclientform","command", c);
	 }
	 
	 // Deleta cliente conforme o cnpj passado como par�metro.
	 @RequestMapping(value="deleteclient/{cnpj}", method = RequestMethod.GET)
	 public ModelAndView delete(@PathVariable String cnpj) {
		 dao.delete(cnpj);
		 return new ModelAndView("redirect:/clients");
	 }
	 
}
