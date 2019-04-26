package com.example.campgeiger;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    final Context context  = this;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        final AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner activities = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.activities));

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        activities.setAdapter(adapter);


        activities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String Text = String.valueOf(parent.getSelectedItem().toString());
                buildDialog(Text);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

            public void buildDialog(String text){

                if(text.equals("Select your activity")){

                }
                else if (text.equals("Animal Science MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.aScienceMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Archaeology MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.ArchaeologyMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Archery MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.ArcheryMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Astronomy MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.AstronomyMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Automotive Maintenance MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.AutomotiveMaintenanceMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Basketry and Textile MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.BasketryandTextileMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Beginning Swimmer MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.BeginningSwimmerMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Bird Study MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.BirdStudyMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("COPE MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.COPEMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Camping MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.CampingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Canoeing MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.CanoeingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Chess MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.ChessMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Citizenship in the Community MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.CitizenshipintheCommunityMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Citizenship in the Nation MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.CitizenshipintheNationMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Citizenship in the World MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.CitizenshipintheWorldMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Climbing MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.ClimbingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Communication MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.CommunicationMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Cooking MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.CookingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Cycling MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.CyclingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("ELITE MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.ELITEMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Electricity MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.ElectrictyMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Emergency Preparedness MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.EmergencyPreparednessMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Environmental Science MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.EnvironmentalScienceMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Wilderness Survival MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.WildernessSurvivalMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Extra Swimming / Lifesaving MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.ExtraSwimmingLifesavingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Fingerprinting and Crime Prevention MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.FingerprintingCrimePreventionMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("First Aid MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.FirstAidMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("First Class Trail MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.FirstClassTrailMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Fish and Wildlife and Forestry MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.FishandWildlifeForestryMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Fishing MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.FishingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Fly Fishing MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.FlyFishingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Geology and Soil and Water Conservation MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.GeologySoilandWaterConservationMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Golf MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.GolfMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Indian Lore MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.IndianLoreMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Johnny Fry MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.JohnnyFryMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Kayaking MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.KayakingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Leatherwork MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.LeatherworkMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Leave No Trace MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.LeaveNoTraceMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Lifesaving MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.LifesavingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Metalwork MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.MetalworkMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Mic-O-Say MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.MicOSayMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Mile Swim MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.MileSwimMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Music MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.MusicMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Non-Swimmer MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.NonSwimmerMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Oceanography and Weather MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.OceanographyWeatherMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Orienteering MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.OrienteeringMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Paddle Craft Safety Training MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.PaddleCraftSafetyTrainingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Personal Fitness MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.PersonalFitnessMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Personal Management MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.PersonalManagementMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Photography MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.PhotographyMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Plumbing MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.PlumbingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Pottery and Sculpture MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.PotteryandSculptureMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Radio MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.RadioMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Reptile and Amphibian Study MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.ReptileAmphibianStudyMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Rifle Shooting (.22 cal) MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.RifleShootingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Rowing MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.RowingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Search and Rescue MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.SearchandRescueMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Shotgun Shooting MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.ShotgunShootingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Space Exploration MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.SpaceExplorationMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Sustainability MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.SustainabilityMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Swimming MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.SwimmingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Swimming and Water Rescue Training MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.SwimmingandWaterRescueTrainingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
                else if (text.equals("Woodcarving MB")){
                    setContentView(R.layout.custom);
                    dialog.setMessage(R.string.WoodcarvingMB);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
            }
        });
    }
}

