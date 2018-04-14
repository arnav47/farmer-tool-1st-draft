package com.prediction;

import java.util.Calendar;

public class LinearRegression
{

public static double yield_predict(double[] crop_yield) {

int MAXN = 1000;

int n = 0;

double predicted_value=0.0;

double[] x = {2008,2009,2010,2011,2012,2013,2014,2015,2016,2017};


double[] y=crop_yield;



double sumx = 0.0, sumy = 0.0, sumx2 = 0.0;



while(n<x.length) 
{

sumx += x[n];

sumx2 += x[n] * x[n];

sumy += y[n];

n++;

}

double xbar = sumx / n;

double ybar = sumy / n;

// second pass: compute summary statistics

double xxbar = 0.0, yybar = 0.0, xybar = 0.0;

for (int i = 0; i < n; i++) {

xxbar += (x[i] - xbar) * (x[i] - xbar);

yybar += (y[i] - ybar) * (y[i] - ybar);

xybar += (x[i] - xbar) * (y[i] - ybar);

}

double beta1 = xybar / xxbar;

double beta0 = ybar - beta1 * xbar;

// print results

System.out.println("y = " + beta1 + " * x + " + beta0);

int year = Calendar.getInstance().get(Calendar.YEAR);
predicted_value=(beta1*(year))+beta0;

// analyze results

int df = n - 2;

double rss = 0.0; // residual sum of squares

double ssr = 0.0; // regression sum of squares

for (int i = 0; i < n; i++) {

double fit = beta1*x[i] + beta0;

rss += (fit - y[i]) * (fit - y[i]);

ssr += (fit - ybar) * (fit - ybar);

}

double R2 = ssr / yybar;

double svar = rss / df;

double svar1 = svar / xxbar;

double svar0 = svar/n + xbar*xbar*svar1;



svar0 = svar * sumx2 / (n * xxbar);


return predicted_value;

}

}