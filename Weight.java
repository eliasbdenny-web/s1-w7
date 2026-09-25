public class Weight{
    public int pounds;
    public int ounces;
    public Weight(int pounds, int ounces){
        if (ounces >= 0 && ounces < 16){
          this.ounces = ounces;
        }
        if (pounds > 0){
          this.pounds = pounds;
        }
    }
        public Weight(int ounces){
          this(ounces,0);
        }
        public int totalOunces(){
          return this.ounces + 16 * this.pounds;
        }
        public boolean isHeavier(Weight w){
          int totalWeight = this.totalOunces();
          int otherWeight = w.totalOunces() ;
          if (totalWeight > otherWeight)
          return true;
          else
            return false;
        }
        public Weight multiple(int scale){
          int newOunces = this.totalOunces() * scale;
          int p = newOunces / 16;
          int o = newOunces % 16;
          return new Weight(p, o);
        }
        public void print(){
          System.out.println(this.pounds + " pounds " + this.ounces + " ounces");
        }
    }
