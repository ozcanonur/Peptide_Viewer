public class Peptide
{
    public String spectrumNumber;
    public String fileName;
    public String peptideSeq;
    public String eValue;
    public String mass;
    public String gi;
    public String accession;
    public String start;
    public String end;
    public String defline;
    public String mods;
    public String charge;
    public String theoMass;
    public String pValue;
    public String nistScore;
       
    public Peptide(String spectrumNumber, String fileName, String peptideSeq, 
            String eValue, String mass, String gi, String accession, 
            String start, String end, String defline, String mods, 
            String charge, String theoMass, String pValue, String nistScore)
    {
        this.spectrumNumber = spectrumNumber;
        this.fileName = fileName;
        this.peptideSeq = peptideSeq;
        this.eValue = eValue;
        this.mass = mass;
        this.gi = gi;
        this.accession = accession;
        this.start = start;
        this.end = end;
        this.defline = defline;
        this.mods = mods;
        this.charge = charge;
        this.theoMass = theoMass;
        this.pValue = pValue;
        this.nistScore = nistScore;
    }       
}
