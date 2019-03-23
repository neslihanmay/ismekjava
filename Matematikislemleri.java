package org.ismek.sinif;

public class Matematikislemleri {
	public int sayac;
	
	public int topla(int s1,int s2)
		{
			int toplam= s1+s2;
			sayac++;
			return toplam;
	
		}
	public int cıkarma(int s1, int s2)	
    {
    	int cıkarma=s1-s2;
    	sayac++;
    	return cıkarma;
    	
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
