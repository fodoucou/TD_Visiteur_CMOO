import java.util.Set;
import java.util.HashSet;

public class GroupeClient implements IVisitable {
   private String name;
   
   private void setName(String value) {
      this.name = value;
   }
   
   private String getName() {
      return this.name;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * GroupeClient ------------------------- Client
    *           &gt;       client
    * </pre>
    */
   private Set<Client> client;
   
   public Set<Client> getClient() {
      if (this.client == null) {
         this.client = new HashSet<Client>();
      }
      return this.client;
   }
   
   public void accept(IVisitor visitor) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
  
   
   public void addClient(Client c) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public GroupeClient (String name) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
