/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.HackerRank_Algorithms_Implementation;

/**
 *
 * @author apprajapati
 */
public class TestClass {
    
    public static void main( String[] args){
        
        String mString = "BLTRouting=BEX;tpid=v.1,70205;abov=-4|-1|-1;iEAPID=0;JSESSION=86dd5175-853d-4bdf-8d24-f3e1e509ecaa;abucket=CgARF1nnnYAUKTDQAxYxAg==;MC1=GUID=7a64440821e344248a5b9ce7cbb5b1a1;DUAID=7a644408-21e3-4424-8a5b-9ce7cbb5b1a1;HMS=3e276d94-c4ea-413d-bc8c-099669a915b4;HSEWC=0;ADRUM_BTa=R:49|g:7de94b61-460b-4a16-b223-45d5068c18f7;ADRUM_BT1=R:49|i:7703|e:856;minfo=v.5,EX01E31BA730$1CP$BF$30Ae$A1l$31k65g$D0$15$FB$31$35$17$89$E8f$29a$2D$A5$1D$92$D1rk$127$9E$39l1$38$5F$0E$90$7B$13$B5.I$94$FE$3E$D1$84$17;accttype=v.2,7,1,EX0153585AB4$1CP$BF$30Ue$B8l$39k6$0Cg$D4$18$FE$31$36$16$8B$EAf$1Aa$2D;linfo=v.4,ERIC|0|0|255|1|0||||||||3084|0|0||0|0|-4|-1|-1;currency=CAD;user=v.8,0,EX01C0802537z$15001000$8Ew$878$AA$DD40$AA$DD40$AA$DD40$3D$12101000$0F71!90$31$D1$1B$C8$C3$3B$8A$C4!i02000;iEAPID_SF=1;IDE=AHWqTUmHe42j6Fcz4LA3AZJE4cKTEHNRY55O2DlZfxw2VO6u9qHkODlyG4aWgNVS";
        String[] Cookies = mString.split(",");
        
        System.out.println("iOS cookie size" + Cookies.length);
    }
    
}
