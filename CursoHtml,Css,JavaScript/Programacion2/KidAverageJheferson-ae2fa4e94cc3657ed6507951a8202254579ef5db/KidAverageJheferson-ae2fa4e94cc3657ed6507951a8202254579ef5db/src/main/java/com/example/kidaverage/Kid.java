package com.example.kidaverage;
public class Kid {
    @Service
    @Getter
    public class KidService {
        public KidService() {
            this.kid = new ArrayList<>();
            this.ages=new ArrayList<>();
        }
        private List<Kid> kid;
        private List<Age> ages;

        public int getTotalAge() {
            int sum = 0;
            for (Age age : ages) {
                sum = sum + age.getQuantity();
            }
            re
            public int getTotalSales () {
                int sum = 0;
                for (Sale sale : sales) {
                    sum = sum + sale.getQuantity();
                }
                return sum;
                return sum;
            public KidService() {
                    this.kid = new ArrayList<>();
                }
                public void addKid (Kid kids){
                    kid.add(kids);
                }
                public Kid getTotalKidById (String code){
                    for (Kid kids : kid) {
                        if (kids.getCode().equalsIgnoreCase(code)) {
                            return kids;
                        }
                    }
                    return null;
                }
                public int getTotalAge () {
                    int sum = 0;
                    for (Age age :) {
                        sum = sum + kids.getQuantity();
                    }
                    public int getTotalSales () {
                        int sum = 0;
                        for (Sale sale : sales) {
                            sum = sum + sale.getQuantity();
                        }
                        return sum;
                        return sum;
                        public int getTotalKidByAge (String codeAge){
                            int sum = 0;
                            for (Kid kids : kid) {
                                if (kids.getKid().getCode().equals(codeage)) {
                                    sum = sum + kids.getQuantity();
                                }
                            }
                            return sum;
                        }


                    }
                }
            }
        }
}
