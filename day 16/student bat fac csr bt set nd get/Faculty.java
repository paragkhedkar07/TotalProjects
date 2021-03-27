public class Faculty
{
private int fid;
private String fname;
private Course crs;
public void setFid(int fid)
{
  this.fid=fid;
}
public int getFid()
{
 return fid;
}
public void setFname(String fname)
{
 this.fname=fname;
}
public String getFname()
{
 return fname;
}
public void setCrs(Course crs)
{
  this.crs=crs;
}
public Course getCrs()
{
 return crs;
}
}