
public class Main {
   /**
    * <pre>
    *           0..*     1..1
    * Main ------------------------> IVisitor
    *           &gt;       visiteur
    * </pre>
    */
   private IVisitor visiteur;
   
   public void setVisiteur(IVisitor value) {
      this.visiteur = value;
   }
   
   public IVisitor getVisiteur() {
      return this.visiteur;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * Main ------------------------> GroupeClient
    *           &gt;       groupeClient
    * </pre>
    */
   private GroupeClient groupeClient;
   
   public void setGroupeClient(GroupeClient value) {
      this.groupeClient = value;
   }
   
   public GroupeClient getGroupeClient() {
      return this.groupeClient;
   }
   
   public void main() {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
