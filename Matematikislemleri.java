package org.ismek.sinif;

public class Matematikislemleri {
	public int sayac;
	
	public int topla(int s1,int s2)
		{
			int toplam= s1+s2;
			sayac++;
			return toplam;
	
		}
	public int c�karma(int s1, int s2)	
    {
    	int c�karma=s1-s2;
    	sayac++;
    	return c�karma;
    	
    }
	public int carpim(int s1, int s2)	
    {
    	int carpim=s1*s2;
    	sayac++;
    	return carpim;
    }
	public float bolme(float s1, float s2)	
    {
    	float bolme=s1/s2;
    	sayac++;
    	return bolme;
    }
    

    
	}
