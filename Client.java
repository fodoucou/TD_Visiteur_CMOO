import java.util.Set;
import java.util.HashSet;

public class Client implements IVisitable {

   private String name;
   
   private void setName(String value) {
      this.name = value;
   }
   
   private String getName() {
      return this.name;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * Client ------------------------- GroupeClient
    *           client        &lt;       
    * </pre>
    */
   
   
   /**
    * <pre>
    *           1..1     0..*
    * Client ------------------------- Commande
    *           client        &gt;       commande
    * </pre>
    */
   private Set<Commande> commande;
   
   public Set<Commande> getCommande() {
      if (this.commande == null) {
         this.commande = new HashSet<Commande>();
      }
      return this.commande;
   }
   
   public void accept(IVisitor visitor) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
  
   
   public void addCommande(Commande c) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Client (String name) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
