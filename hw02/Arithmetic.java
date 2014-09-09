//Steven Jodogne
//Arithmetic Java Program
//CSE 2 HW02
//9/7/2014
//Computer the cost of items bought including sales tax
    public class Arithmetic {
        public static void main(String[] args)  {
           
            int nSocks=3;//Number of Pair of Socks
            double sockCost$=2.58;//Cost per pair of socks
            int nGlasses=6;//Number of Drinking Glass
            double glassCost$=2.29;//Cost per glass
            int nEnvelopes=1;//Number of boxes of envelopes
            double envelopeCost$=3.25;//cost per box of envelopes
            double taxPercent=0.06;//Tax Percentages
            
            double TotalSockCost$=nSocks * sockCost$;//Declare Total Cost of Socks
            double TotalGlassCost$=nGlasses * glassCost$;//Declare Total Cost of Glasses
            double TotalEnvelopeCost$=nEnvelopes * envelopeCost$;//Declare Total Cost of Envelopes
            
            double SockTax$= TotalSockCost$ * taxPercent;//Declare Tax on Socks
            double GlassTax$= TotalGlassCost$ * taxPercent;//Declare Tax on Glasses
            double EnvelopeTax$= TotalEnvelopeCost$ * taxPercent;//Declare Tax on Envelopes
            
            double FinalSockCost$= SockTax$ + TotalSockCost$;//Declare Final Sock Cost
            double FinalGlassCost$= GlassTax$ + TotalGlassCost$;//Declare Final Glass Cost
            double FinalEnvelopeCost$= EnvelopeTax$ + TotalEnvelopeCost$;//Declare Final Envelope Cost
            
            double FinalTaxCost$= SockTax$ + GlassTax$ + EnvelopeTax$;//Declare Tax Total
            double TotalCost$= FinalSockCost$ + FinalEnvelopeCost$ + FinalGlassCost$;//Declare Total Cost
            
            SockTax$ = ((int)(SockTax$ * 100)) / 100.0;//Casting
            GlassTax$ = ((int)(GlassTax$ * 100)) / 100.0;
            EnvelopeTax$ = ((int)(EnvelopeTax$ * 100)) / 100.0;
            FinalSockCost$ = ((int)(FinalSockCost$ * 100)) / 100.0;
            FinalGlassCost$ = ((int)(FinalGlassCost$ * 100)) / 100.0;
            FinalEnvelopeCost$ = ((int)(FinalEnvelopeCost$ * 100)) / 100.0;
            FinalTaxCost$ = ((int)(FinalTaxCost$ * 100)) / 100.0;
            TotalCost$ = ((int)(TotalCost$ * 100)) / 100.0;
            
            
            
            System.out.println("Socks");
            System.out.println("Cost of Socks:" + sockCost$);
            System.out.println("Number of Socks:" + nSocks);
            System.out.println("Total Cost of Socks:" + TotalSockCost$);
            System.out.println("Tax on Socks:" + SockTax$);
            System.out.println("Final Cost of Socks:" + FinalSockCost$);
            
            System.out.println("Glass");
            System.out.println("Cost of Glass:" + glassCost$);
            System.out.println("Number of Glasses:" + nGlasses);
            System.out.println("Total Cost of Glasses:" + TotalGlassCost$);
            System.out.println("Tax on Glasses:" + GlassTax$);
            System.out.println("Final Cost of Glasses:" + FinalGlassCost$);
            
            System.out.println("Envelopes");
            System.out.println("Cost of Envelopes:" + envelopeCost$);
            System.out.println("Number of Envelopes:" + nEnvelopes);
            System.out.println("Total Cost of Envelopes:" + FinalEnvelopeCost$);
            System.out.println("Tax on Envelops:" + EnvelopeTax$);
            System.out.println("Final Cost of Envelopes:" + FinalEnvelopeCost$);
            
            System.out.println("Final Sales Tax:" + FinalTaxCost$);
            System.out.println("Final Cost:" + TotalCost$);
            
            
        }
    }
            