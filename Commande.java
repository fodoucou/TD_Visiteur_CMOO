import java.util.Set;
import java.util.HashSet;

public class Commande implements IVisitable {
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
    * Commande ------------------------- Client
    *           commande        &lt;       client
    * </pre>
    */
   private Client client;
   
   public void setClient(Client value) {
      this.client = value;
   }
   
   public Client getClient() {
      return this.client;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * Commande ------------------------- Ligne
    *           commande        &gt;       ligne
    * </pre>
    */
   private Set<Ligne> ligne;
   
   public Set<Ligne> getLigne() {
      if (this.ligne == null) {
         this.ligne = new HashSet<Ligne>();
      }
      return this.ligne;
   }
   
   public void accept(IVisitor visitor) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   
   
   public void addLigne(Ligne l) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public Commande (String name, String ligneName) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
