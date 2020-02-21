package com.example.mensajellamada;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class BroadcastReceiverPrueba extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle prueba = intent.getExtras();

        if(prueba!= null){
            if(prueba.getString("state").equals(TelephonyManager.EXTRA_STATE_RINGING)){
                String telefonoPrueba = intent.getExtras().getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                String telefono = MainActivity.intent.getStringExtra("tel");
                String mensaje = MainActivity.intent.getStringExtra("texto");

              //  Toast.makeText(context,  telefonoPrueba+ "insertar"+ telefono, Toast.LENGTH_SHORT).show();


                if(telefonoPrueba.equals("+52"+ telefono)){
                    Toast.makeText(context, "Los numeros coinciden", Toast.LENGTH_LONG).show();
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(telefono, null, mensaje, null, null);

                }else if(telefonoPrueba.equals(telefono)){
                    Toast.makeText(context, "Los numeros coinciden", Toast.LENGTH_LONG).show();
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(telefono, null, mensaje, null, null);
                }else {
                    Toast.makeText(context, "Son diferentes", Toast.LENGTH_LONG).show();
                }



            }
        }


    }
}
