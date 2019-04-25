package com.example.campgeiger;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME =  "CampGeiger2019.db";
    public static final String TABLE_NAME = "Geiger2019";

    public static final String COL_1 = "ActivityName";
    public static final String COL_2 = "Location";
    public static final String COL_3 = "ActivityTime";
    public static final String COL_4 = "ActivityLength";
    public static final String COL_5 = "RecommendedFor";
    public static final String COL_6 = "Materials";
    public static final String COL_7 = "Costs";
    public static final String COL_8 = "PreReq";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(ActivityName TEXT, " +
                "Location TEXT, " +
                "ActivityTime TEXT, " +
                "ActivityLength TEXT, " +
                "RecommendedFor TEXT, " +
                "Materials TEXT, " +
                "Costs TEXT, " +
                "PreReq TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void insertData() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("INSERT INTO "+ TABLE_NAME +" Values('Animal Science MB', \n" +
                "  'Nature Lodge', \n" +
                "  '11 A.M. / 4 P.M.', \n" +
                "  '1 Hour', \n" +
                "  'Any Scout', \n" +
                "  'Paper and Pencil or Pen, Water Bottle', \n" +
                "  'NONE', \n" +
                "  'NONE'),\n" +
                "  ('Archaeology MB', \n" +
                "  'Nature Lodge', \n" +
                "  '10 A.M. / 2 P.M.', \n" +
                "  '1 Hour', \n" +
                "  'Any Scout', \n" +
                "  'Paper and Pencil or Pen, Water Bottle', \n" +
                "  'NONE', \n" +
                "  'NONE'),\n" +
                "  ('Archery MB', \n" +
                "  'Archery Range', \n" +
                "  '9 A.M. / 11 A.M. / 3 P.M. / 4 P.M.',\n" +
                "  '1 Hour', \n" +
                "  '3rd year camper or 13 years of age or older', \n" +
                "  'Arrow Kit, which are available at the Trading Post',\n" +
                "  '$5.00', \n" +
                "  'NONE'),\n" +
                "  ('Astronomy MB', \n" +
                "  'Nature Lodge', \n" +
                "  '9 A.M.', \n" +
                "  '1 Hour', \n" +
                "  'Scouts who have completed the 7th grade', \n" +
                "  'Paper and pen or pencil', \n" +
                "  'NONE', \n" +
                "  'NONE'),\n" +
                "  ('Automotive Maintenance MB', \n" +
                "  'Handcraft Corral', \n" +
                "  '9 A.M. / 10 A.M. / 2 P.M.', \n" +
                "  '1 Hour', \n" +
                "  'Any Scout', \n" +
                "  'Paper and pen or pencil', \n" +
                "  'NONE', \n" +
                "  'NONE'),\n" +
                "  ('Basketry and Textile MB', \n" +
                "  'Handicraft Pavilion', \n" +
                "  '10 A.M. / 11 A.M. / 2 P.M. / 3 P.M. / 4 P.M.', \n" +
                "  '1 Hour', \n" +
                "  'Any Scout', \n" +
                "  'Basketry materials, which are available at the Trading Post', \n" +
                "  '10 dollars', \n" +
                "  'NONE'),\n" +
                "  ('Bird Study MB', \n" +
                "  'Nature Lodge', \n" +
                "  '10 A.M.', \n" +
                "  '1 Hour', \n" +
                "  'Any Scout', \n" +
                "  'Binoculars are highly recommended. Paper and pen or pencil', \n" +
                "  'NONE',\n" +
                "  'NONE'),\n" +
                "  ('Camping MB', \n" +
                "  'Scoutcraft Pavilion', \n" +
                "  '2 P.M. / 3 P.M.', \n" +
                "  '1 Hour', \n" +
                "  '2nd year camper and older, preferably First Class rank or higher', \n" +
                "  'NONE', \n" +
                "  'NONE', \n" +
                "  'NONE'),\n" +
                "  ('Canoeing MB', \n" +
                "  'Lake Front', \n" +
                "  '9 A.M.', \n" +
                "  '2 Hours', \n" +
                "  '3rd year camper or 13 years of age and older', \n" +
                "  'Shoes that can get wet', \n" +
                "  'NONE', \n" +
                "  'The Scout must attain Swimmer classification during the Sunday swim check. Participants need to be ready to get wet every day.'),\n" +
                "  ('Chess MB', \n" +
                "  'Trading Post', \n" +
                "  '11 A.M. / 2 P.M.', \n" +
                "  '1 Hour', \n" +
                "  'Any Scout', \n" +
                "  'NONE', \n" +
                "  'NONE', \n" +
                "  'NONE'),\n" +
                "  ('Citizenship in the Community MB', \n" +
                "  'Eagle training area (Handicraft Bldg.)', \n" +
                "  '9 A.M. / 2 P.M.', \n" +
                "  '1 Hour', \n" +
                "  '2nd year camper or older and preferably First Class', \n" +
                "  'Paper and pen or pencil', \n" +
                "  'NONE', \n" +
                "  'Visit to a public meeting and community service requirements cannot be completed at camp.  Scouts who attend a public meeting before camp should bring a copy of the agenda and be prepared to discuss the meeting. A written note from the Scoutmaster certifying completion of the community service will be accepted.'),\n" +
                "  ('Citizenship in the Nation MB', \n" +
                "  'Eagle training area (Handicraft Bldg.)', \n" +
                "  '10 A.M. / 3 P.M.',\n" +
                "  '1 Hour', \n" +
                "  '2nd year camper or older and preferably First Class', \n" +
                "  'Paper and pen or pencil', \n" +
                "  'NONE', \n" +
                "  'Review the requirements and bring a note from a parent or Scoutmaster certifying completion of the site visits. As time allows, the letter to a Congressman or Senator may be completed at camp.'),\n" +
                "  ('Citizenship in the World MB', \n" +
                "  'Eagle training area (Handicraft Bldg.)',\n" +
                "  '11 A.M. / 3 P.M.', \n" +
                "  '1 Hour', \n" +
                "  '2nd year camper or older and preferably First Class', \n" +
                "  'Paper and pen or pencil', \n" +
                "  'NONE',\n" +
                "  'NONE'),\n" +
                "  ('Climbing MB', \n" +
                "  'Climbing Tower',\n" +
                "  '9 A.M.',\n" +
                "  '2 Hours',\n" +
                "  'Any Scout',\n" +
                "  'Closed toe shoes',\n" +
                "  'NONE',\n" +
                "  'No fear of heights.'),\n" +
                "  ('Communication MB', \n" +
                "  'Eagle training area (Handicraft Bldg.)',\n" +
                "  '9 A.M. / 2 P.M.',\n" +
                "  '1 Hour',\n" +
                "  '2nd year camper or older and preferably First Class', \n" +
                "  'Paper and pen or pencil', \n" +
                "  'NONE',\n" +
                "  'Scouts who attend a public meeting before camp should bring a copy of the agenda and be prepared to discuss the meeting.'),\n" +
                "  ('Cooking MB',\n" +
                "  'Sol Hirsh Lodge in Handicraft Corral',\n" +
                "  '9 A.M. / 2 P.M.',\n" +
                "  '2 Hours',\n" +
                "  'Any Scout',\n" +
                "  'NONE',\n" +
                "  'NONE',\n" +
                "  'Requirement 5 cannot be completed at camp. A Scout may bring a note signed by his Scoutmaster indicating the meal requirements have been completed.'),\n" +
                "  ('Cycling MB',\n" +
                "  'Cycling shed (near Trading Post)',\n" +
                "  '9 A.M. / 10 A.M. / 11 A.M. / 2 P.M. / 3 P.M.', \n" +
                "  '1 Hour',\n" +
                "  '3rd year camper or 13 years of age or older',\n" +
                "  'Personal First Aid Kit, Closed toe shoes, Water bottle', \n" +
                "  'NONE', \n" +
                "  'NONE'),\n" +
                "  ('Electricty MB',\n" +
                "  'Basement of Maryville Lodge', \n" +
                "  '9 A.M. / 2 P.M.', \n" +
                "  '1 Hour', \n" +
                "  'Any Scout', \n" +
                "  'Paper and pen or pencil, water bottle',\n" +
                "  'NONE',\n" +
                "  'Scouts should wear long pants'),\n" +
                "  ('Emergency Preparedness MB',\n" +
                " 'Sol Hirsh Lodge in Handicraft Corral',\n" +
                " '11 A.M. / 3 P.M.',\n" +
                " '1 Hour',\n" +
                " '2nd year camper or older',\n" +
                " 'Emergency Kit', \n" +
                " 'NONE', \n" +
                " 'First Aid Merit Badge is required and may be taken in the same camp session. Scouts will need to complete the emergency kit before coming to camp.'),\n" +
                "  ('Environmental Science MB',\n" +
                "   'Nature Lodge',\n" +
                "   '9 A.M. / 3 P.M.',\n" +
                "   '2 Hours',\n" +
                "   'Any Scout',\n" +
                "   'Paper and pen or pencil',\n" +
                "   'NONE',\n" +
                "   'Part of this activity requires a nature hike. Wear appropriate closed-toe shoes and bring a water bottle every day of the activity.'),\n" +
                "   ('Fingerprinting & Crime Prevention MB', \n" +
                "   'Basement of Goetz Lodge',\n" +
                "   '2 P.M. / 3 P.M. / 4 P.M.',\n" +
                "   '1 Hour',\n" +
                "   'Any Scout',\n" +
                "   'Paper, pen or pencil', \n" +
                "   'NONE', \n" +
                "   'The Crime Prevention notebook requirement cannot be completed at camp. A Scout may prepare and bring a notebook of newspaper and other clippings that address crime and crime prevention efforts in his community to meet this requirement.'),\n" +
                "   ('First Aid MB', \n" +
                "   'Sol Hirsh Lodge in Handicraft Corral', \n" +
                "   '10 a.m. / 2 p.m.',\n" +
                "   '1 Hour',\n" +
                "   '2nd year camper and older',\n" +
                "   'Scout-built personal First Aid kit', \n" +
                "   'NONE',\n" +
                "   'If a Scout wishes to complete the badge at camp, he must bring the personal First Aid kit he built prior to camp.'),\n" +
                "   ('Fish and Wildlife & Forestry MB', \n" +
                "   'Nature Lodge', \n" +
                "   '11 a.m. / 2 p.m.',\n" +
                "   '1 hour', 'Any Scout',\n" +
                "   'Paper, pen or pencil', \n" +
                "   'NONE',\n" +
                "   'NONE'), \n" +
                "   ('Fishing MB',\n" +
                "   'Lake Front',\n" +
                "   '9 a.m. period but starts at 8:30 a.m.',\n" +
                "   '1 hour 30 minutes', \n" +
                "   'Any Scout', \n" +
                "   'All fishing gear will be provided', \n" +
                "   'NONE', \n" +
                "   'NONE'), \n" +
                "   ('Fly Fishing MB', \n" +
                "   'Lake Front', \n" +
                "   '4 p.m.',\n" +
                "   '1 hour',\n" +
                "   '3rd year campers or 13 years of age and older',\n" +
                "   'NONE',\n" +
                "   '$5.00',\n" +
                "   'NONE'), \n" +
                "   ('Geology & Soil and Water Conservation MB', \n" +
                "   'Nature Lodge',\n" +
                "   '11 a.m. / 4 p.m.',\n" +
                "   '1 hour',\n" +
                "   'Any Scout',\n" +
                "   'Paper, pen or pencil, closed-toe shoes',\n" +
                "   'NONE',\n" +
                "   'This activity does require a nature hike and a conservation project. Please wear closed-toe shoes and bring a water bottle every day.'),\n" +
                "   ('Golf MB', \n" +
                "   'Scoutcraft Pavilion',\n" +
                "   '10 a.m. / 11 a.m.', \n" +
                "   '1 hour',\n" +
                "   '2nd year camper and older', \n" +
                "   'Water bottle', \n" +
                "   'NONE',\n" +
                "   'Requirements involving completing rounds of golf cannot be completed at camp. A Scout can bring a written note from the Scoutmaster or a scorecard from the course to show proof of completion.'),\n" +
                "   ('Indian Lore MB', \n" +
                "   'Tipi near Goetz, Swimming Rock Lodges', \n" +
                "   '10 a.m. / 11 a.m. / 3 p.m. / 4 p.m.',\n" +
                "   '1 hour',\n" +
                "   '2nd year camper and older', \n" +
                "   'Costume kits, which are available at the Trading Post', \n" +
                "   'Approximately $20.00', \n" +
                "   'NONE'),\n" +
                "   ('Kayaking MB',\n" +
                "   'Lake Front', \n" +
                "   '10 a.m. / 2 p.m.', \n" +
                "   '2 hours', \n" +
                "   'Any Scout',\n" +
                "   'Shoes that can get wet.',\n" +
                "   'NONE',\n" +
                "   'The Scout must attain “Swimmer” classification during the Sunday swim check. Participants should plan on being in the water every day and should wear appropriate clothing.'),\n" +
                "   ('Leatherwork MB', \n" +
                "   'Handicraft Pavilion', \n" +
                "   '9 a.m. / 11 a.m. / 2 p.m. / 3 p.m. / 4 p.m.',\n" +
                "   '1 hour',\n" +
                "   'Any Scout',\n" +
                "   'Leatherworking kits can be purchased at the Trading Post',\n" +
                "   '$15.00',\n" +
                "   'NONE'),\n" +
                "   ('Lifesaving MB', \n" +
                "   'Pool', \n" +
                "   '9 a.m.', \n" +
                "   '2 hours', \n" +
                "   '3rd year camper or 13 years of age or older', \n" +
                "   'Long-sleeved buttoned shirt, long pants, belt, shoes, socks, swim trunks, towel', \n" +
                "   'NONE', \n" +
                "   'Scout must have earned Swimming Merit Badge. A 440-yard qualifying swim will be required the first day of the activity, Only strong swimmers will be able to qualify for this badge. Completion of CPR course prior to camp is recommended. There will be CPR training on Thursday night at 5 p.m., but it can be replaced with a CPR training card or other documentation.'),\n" +
                "   ('Metalwork MB', \n" +
                "   'Handicraft Pavilion', \n" +
                "   '9 a.m./10 a.m./11 a.m./3 p.m./4 p.m.', \n" +
                "   '1 hour',\n" +
                "   '16 years of age and older', \n" +
                "   'Jeans or thick cloth pants, closed toe shoes, no nylon or polyester shirts', \n" +
                "   '$13.00', \n" +
                "   'NONE'),\n" +
                "   ('Music MB', \n" +
                "  'Trading Post', \n" +
                "  '9 a.m. / 10 a.m.',\n" +
                "  '1 hour', 'Any Scout',\n" +
                "  'NONE', \n" +
                "  'NONE', \n" +
                "  'NONE'),\n" +
                "   ('Oceanography & Weather MB',\n" +
                "   'Nature Lodge', \n" +
                "   '9 a.m. / 4 p.m.',\n" +
                "   '1 hour',\n" +
                "   'Any Scout', \n" +
                "   'Paper, pen or pencil', \n" +
                "   'NONE',\n" +
                "   'NONE'),\n" +
                "   ('Orienteering MB',\n" +
                "   'Scoutcraft Pavilion', \n" +
                "   '3 p.m.', \n" +
                "   '1 hour', \n" +
                "   'Any Scout', \n" +
                "   'Compass, hiking boots or shoes, water bottle', \n" +
                "   'NONE', \n" +
                "   'NONE'),\n" +
                "   ('Personal Fitness MB', \n" +
                "   'Sol Hirsh Lodge in Handicraft Corral', \n" +
                "   '9 a.m./11 a.m./4 p.m.', \n" +
                "   '1 hour', \n" +
                "   '2nd year camper or older, preferably First Class or above', \n" +
                "   'Tennis shoes, paper, pen or pencil', \n" +
                "   'NONE', \n" +
                "   'NONE'),\t\n" +
                "    ('Personal Management MB',\n" +
                "    'Sol Hirsh Lodge in Handicraft Corral',\n" +
                "    '10 a.m./2 p.m./3 p.m.',\n" +
                "    '1 hour',\n" +
                "    '2nd year camper or older, preferably First Class or above',\n" +
                "    'Paper, pen or pencil',\n" +
                "    'NONE',\n" +
                "    'NONE'),\n" +
                "    ('Photography MB',\n" +
                "    'Museum',\n" +
                "    '9 a.m./3 p.m.',\n" +
                "    '1 hour',\n" +
                "    '2nd year camper and older',\n" +
                "    'Sturdy shoes and a water bottle',\n" +
                "    'NONE',\n" +
                "'Scouts must earn their Cyber Chip prior to camp and bring documentation to camp. Scouts may bring their own camera but will need to use a provided SD memory card. A cell phone with a camera does not work. A flash drive is needed to take home any pictures taken on camp devices. Pictures taken may be used for the weekly slide show. Scouts will hike to various areas on camp to take photos.'),\n" +
                "('Pottery and Sculpture MB',\n" +
                "    'Handicraft Pavilion',\n" +
                "    '9 a.m. / 10 a.m. / 2 p.m. / 3 p.m. / 4 p.m.',\n" +
                "    '1 hour',\n" +
                "    'Any Scout',\n" +
                "    'Paper, Pen or Pencil',\n" +
                "    '$5.00',\n" +
                "    'NONE'),    \n" +
                "    ('Plumbing MB',\n" +
                "    'Basement of Maryville Lodge',\n" +
                "    '3 p.m. / 4 p.m.',\n" +
                "    '1 hour',\n" +
                "    'Any Scout',\n" +
                "    'Paper and pen or pencil, water bottle',\n" +
                "    'NONE',\n" +
                "    'Scouts should wear long pants.'),\n" +
                "    ('Radio MB',\n" +
                "    'Front porch of Goetz Lodge',\n" +
                "    '10 a.m. / 11 a.m.',\n" +
                "    '1 hour',\n" +
                "    'Any Scout',\n" +
                "    'Paper, pen or pencil',\n" +
                "    'NONE',\n" +
                "    'NONE'),    \n" +
                "    ('Rifle Shooting (.22 cal) MB',\n" +
                "    'Rifle Range',\n" +
                "    '9 a.m./10 a.m./11 a.m./2 p.m./3 p.m.',\n" +
                "    '1 hour',\n" +
                "    'Any Scout',\n" +
                "    'NONE',\n" +
                "    '$7.50',\n" +
                "    'NONE'),    \n" +
                "    ('Reptile & Amphibian Study MB',\n" +
                "    'Nature Lodge',\n" +
                "    '9 a.m. / 2 p.m.',\n" +
                "    '1 hour',\n" +
                "    'Any Scout',\n" +
                "    'Paper, pen or pencil',\n" +
                "    'NONE',\n" +
                "    'NONE'),\n" +
                "    ('Rowing MB',\n" +
                "    'Lake Front',\n" +
                "    '2 p.m.',\n" +
                "    '2 hours',\n" +
                "    '3rd year campers or 13 years of age or older',\n" +
                "    'Shoes that can get wet',\n" +
                "    'NONE',\n" +
                "    'NONE'),\n" +
                "    ('Search and Rescue MB',\n" +
                "    'Scoutcraft Pavilion',\n" +
                "    '2 p.m. / 3 p.m. / 4 p.m',\n" +
                "    '1 hours',\n" +
                "    '2nd year or older',\n" +
                "    'NONE',\n" +
                "    'NONE',\n" +
                "    'NONE'),\n" +
                "    ('Shotgun Shooting MB',\n" +
                "    'Shotgun Range',\n" +
                "    '9 a.m. / 10 a.m. / 11 a.m./ 2 p.m./ 4 p.m.',\n" +
                "    '1 hour',\n" +
                "    'Must be 3rd year camper or 13 years of age or older',\n" +
                "    'NONE',\n" +
                "    '$15.00',\n" +
                "    'NONE'),\n" +
                "    ('Space Exploration MB',\n" +
                "    'Nature Lodge',\n" +
                "    '2 p.m. / 3 p.m.',\n" +
                "    '1 hour',\n" +
                "    'Any Scout',\n" +
                "    'Estes Viking model rocket kit',\n" +
                "    '$15.00',\n" +
                "    'NONE'),\n" +
                "    ('Sustainability MB',\n" +
                "    'Nature Lodge',\n" +
                "    '10 a.m./3 p.m.',\n" +
                "    '1 hour',\n" +
                "    '2nd year camper or older',\n" +
                "    'Paper, pen or pencil',\n" +
                "    'NONE',\n" +
                "    'NONE'),\n" +
                "    ('Swimming MB',\n" +
                "    'Pool',\n" +
                "    '10 a.m. / 2 p.m.',\n" +
                "    '2 hours',\n" +
                "    'Any Scout',\n" +
                "    'Swim trunks and towel',\n" +
                "    'NONE',\n" +
                "    'The Scout must attain “Swimmer” classification during the Sunday swim check.'),\n" +
                "    ('Wilderness Survival MB',\n" +
                "    'Scoutcraft Pavilion',\n" +
                "    '4 p.m.',\n" +
                "    '1 hour',\n" +
                "    '2nd year camper or older',\n" +
                "    'Sleeping bag, clothing suitable to spend the night in the open, pocket knife, survival kit.',\n" +
                "    'NONE',\n" +
                "    'NONE'),\n" +
                "    ('Woodcarving MB',\n" +
                "    'Handicraft Pavilion',\n" +
                "    '9 a.m./10 a.m./11 a.m./3 p.m./4 p.m.',\n" +
                "    '1 hour',\n" +
                "    '2nd year camper or older',\n" +
                "    'Leather gloves are furnished but Scout may bring his own.',\n" +
                "    '$5.00',\n" +
                "    'Scouts should not bring their own knives to the activity. A totin/ chip must be shown to be allowed to use the\n" +
                "tools provided. * The activity fee will be added to the Scout’s camp registration fees, and the materials will be\n" +
                "provided to the Scout during the activity period.'),\n" +
                "    ('Beginning Swimmer MB',\n" +
                "    'Pool',\n" +
                "    '3 p.m. / 4 p.m.',\n" +
                "    '1 hour',\n" +
                "    'Beginner level swimmers',\n" +
                "    'Swim trunks and towel',\n" +
                "    'NONE',\n" +
                "    'The Scout must attain “Beginner” classification during the Sunday swim check. This activity is designed for\n" +
                "Scouts to learn and practice strokes with the goal of advancing to “Swimmer” level.'),\n" +
                "    ('COPE MB',\n" +
                "    'Climbing Tower',\n" +
                "    '9 a.m.',\n" +
                "    '3 hours',\n" +
                "    '3rd year camper or 13 years and older',\n" +
                "    'Closed toe shoes and clothing that can get dirty',\n" +
                "    'None',\n" +
                "    'Scouts must be present and participate every day to earn the COPE shirt. Scouts must be mature enough to\n" +
                "handle the safety of others around them.'),\n" +
                "    ('ELITE MB',\n" +
                "    'Varies (schedule given at check-in)',\n" +
                "    '3 p.m.',\n" +
                "    '2 hours',\n" +
                "    '14 years of age and older and at least a Life Scout, preferably an Eagle Scout',\n" +
                "    'NONE',\n" +
                "    '$10.00',\n" +
                "    'NONE'),\n" +
                "    ('Extra Swimming / Lifesaving MB',\n" +
                "    'Pool',\n" +
                "    '11 a.m.',\n" +
                "    '1 hour',\n" +
                "    'Scouts needing to complete Swimming or Lifesaving requirements',\n" +
                "    'Swim trunks and towel',\n" +
                "    'NONE',\n" +
                "    'NONE'),\n" +
                "    ('First Class Trail MB',\n" +
                "    'Scoutcraft Pavilion',\n" +
                "    '9 a.m.',\n" +
                "    '3 hours',\n" +
                "    'Scout Rank or Tenderfoot Rank Scouts',\n" +
                "    'Sturdy shoes, water bottle, swimming trunks and towel',\n" +
                "    'NONE',\n" +
                "    'NONE'),\n" +
                "    ('Johnny Fry MB',\n" +
                "    'Cowboy Action Range (initially)',\n" +
                "    '3:00 p.m.',\n" +
                "    '2 hours',\n" +
                "    '2nd year camper or older',\n" +
                "    'Dressing up in Western style is encouraged. ',\n" +
                "    '$10.00',\n" +
                "    'NONE'),\n" +
                "    ('Leave No Trace MB',\n" +
                "    'Nature Lodge',\n" +
                "    '10 a.m.',\n" +
                "    '1 hour',\n" +
                "    '2nd year camper or older, any adult leader',\n" +
                "    'Paper and pen or pencil, Boy Scout Handbook, water bottle',\n" +
                "    'NONE',\n" +
                "    'NONE'),\n" +
                "    ('Mic-O-Say MB',\n" +
                "    'Council Ring',\n" +
                "    '1:30 or 2:00',\n" +
                "    '1 1/2 hours',\n" +
                "    'All Braves, Hardway Warriors, and Tom-Tom Beaters',\n" +
                "    'Current costume for Mic-O-Say rank when directed to bring it.',\n" +
                "    'NONE',\n" +
                "    'NONE'),\n" +
                "    ('Mile Swim MB',\n" +
                "    'Pool',\n" +
                "    'M-T-W 6 a.m',\n" +
                "    '1 hour',\n" +
                "    'Any Scout of Leader who is a proficient swimmer',\n" +
                "    'Swim trunks and towe',\n" +
                "    'NONE',\n" +
                "    'The Scout or Leader must attain “Swimmer” classification during the Sunday swim check.'),\n" +
                "    ('Non-Swimmer MB',\n" +
                "    'Pool',\n" +
                "    '3 p.m. / 4 p.m.',\n" +
                "    '1 hour',\n" +
                "    'Non-swimmers',\n" +
                "    'Swim trunks and towel',\n" +
                "    'NONE',\n" +
                "    'NONE'),\n" +
                "    ('Paddle Craft Safety Training MB',\n" +
                "    'Lake Front',\n" +
                "    'Arranged',\n" +
                "    '3 hours',\n" +
                "    '15 years of age and older',\n" +
                "    'Shoes and clothing that can get wet',\n" +
                "    'NONE',\n" +
                "    'The Scout must attain “Swimmer” classification during the Sunday swim check.'),\n" +
                "    ('Swimming and Water Rescue Training MB',\n" +
                "    'Pool',\n" +
                "    'Arranged',\n" +
                "    '2 hours',\n" +
                "    '16 years and older',\n" +
                "    'Swim trunks and towel',\n" +
                "    'NONE',\n" +
                "    'The Scout must attain “Swimmer” classification during the Sunday swim check.');"
        );
    }
}
