package com.example.gp_all;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Locale;

public class Exhibit_info extends AppCompatActivity  {
    MediaPlayer mPlayer;

    @Override
    protected void onStop() {
        super.onStop();
        if(mPlayer!=null)
        {
            mPlayer.release();
            mPlayer=null;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibit_info);
        //getSupportActionBar().hide();
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));
        final int x = getIntent().getExtras().getInt("Index");
        int x1 =x;
        int[] music=new int[28];
        String y = Locale.getDefault().getLanguage();
        //Toast.makeText(getApplicationContext(), y, Toast.LENGTH_SHORT).show();
        if(y.equals("ar"))
        {
            music[0]=R.raw.exar1;
            music[1]=R.raw.exar2;
            music[2]=R.raw.exar3;
            music[3]=R.raw.exar4;
            music[4]=R.raw.exar5;
            music[5]=R.raw.exar6;
            music[6]=R.raw.exar7;
            music[7]=R.raw.exar7;
            music[8]=R.raw.exar9;
            music[9]=R.raw.exar10;
            music[10]=R.raw.exar11;
            music[11]=R.raw.exar12;
            music[12]=R.raw.exar13;
            music[13]=R.raw.exar14;
            music[14]=R.raw.exar15;
            music[15]=R.raw.exar9;
            music[16]=R.raw.exar17;
            music[17]=R.raw.exar18;
            music[18]=R.raw.exar19;
            music[19]=R.raw.exar20;
            music[20]=R.raw.exar21;
            music[21]=R.raw.exar22;
            music[22]=R.raw.exar23;
            music[23]=R.raw.exar23;
            music[24]=R.raw.exar25;
            music[25]=R.raw.exar26;
            music[26]=R.raw.exar27;
            music[27]=R.raw.exar28;
        }
        else if(y.equals("en"))
        {
            music[0]=R.raw.ex1;
            music[1]=R.raw.ex2;
            music[2]=R.raw.ex3;
            music[3]=R.raw.ex4;
            music[4]=R.raw.ex5;
            music[5]=R.raw.ex6;
            music[6]=R.raw.ex7;
            music[7]=R.raw.ex7;
            music[8]=R.raw.ex9;
            music[9]=R.raw.ex10;
            music[10]=R.raw.ex11;
            music[11]=R.raw.ex12;
            music[12]=R.raw.ex13;
            music[13]=R.raw.ex14;
            music[14]=R.raw.ex15;
            music[15]=R.raw.ex9;
            music[16]=R.raw.ex17;
            music[17]=R.raw.ex18;
            music[18]=R.raw.ex19;
            music[19]=R.raw.ex20;
            music[20]=R.raw.ex21;
            music[21]=R.raw.ex22;
            music[22]=R.raw.ex23;
            music[23]=R.raw.ex23;
            music[24]=R.raw.ex25;
            music[25]=R.raw.ex26;
            music[26]=R.raw.ex27;
            music[27]=R.raw.ex28;
        }
        // TextView name=(TextView) findViewById(R.id.textView49);
        TextView info=(TextView) findViewById(R.id.textView48);
        ImageView image=(ImageView) findViewById(R.id.imageView24);
        int[] id=new int[28];
        id[0]=R.mipmap.im10;
        id[1]=R.mipmap.im11;
        id[2]=R.mipmap.im12;
        id[3]=R.mipmap.im13;
        id[4]=R.mipmap.im4;
        id[5]=R.mipmap.im24;
        id[6]=R.mipmap.im6;
        id[7]=R.mipmap.im27;
        id[8]=R.mipmap.im14;
        id[9]=R.mipmap.im15;
        id[10]=R.mipmap.im16;
        id[11]=R.mipmap.im17;
        id[12]=R.mipmap.im26;
        id[13]=R.mipmap.im18;
        id[14]=R.mipmap.im19;
        id[15]=R.mipmap.im14;
        id[16]=R.mipmap.im23;
        id[17]=R.mipmap.im29;
        id[18]=R.mipmap.im3;
        id[19]=R.mipmap.im30;
        id[20]=R.mipmap.im31;
        id[21]=R.mipmap.im32;
        id[22]=R.mipmap.im33;
        id[23]=R.mipmap.im34;
        id[24]=R.mipmap.im1;
        id[25]=R.mipmap.im5;
        id[26]=R.mipmap.im7;
        id[27]=R.mipmap.im28;
        image.setBackgroundResource(id[x-1]);
        String[] information=new String[28];
        /*
        information[0]=" Hapi the Scribe :\n" +
                " Scribes were amongst the highest-ranking people in ancient Egypt and held important positions " +
                " in the bureaucracy and temples. Hapi was the administrative supervisor of the temple of Amun-Ra at " +
                " Karnak. Here he is shown holding a papyrus that reflects his job as one of the scribes of the temple.\n" +
                " New Kingdom, 19th Dynasty (1295 - 1186 BC) / Karnak / Quartzite .";
        information[1]=" The Priest Psamtik Seneb : The Naophorous or Naos (shrine) carrier statue Is a style of statues " +
                       " that become popular in the Late Period, Such Images expressed the piety of Its owner and his closness" +
                       " to the gods.This statue depicts the priest Psamtlk-Seneb kneeling while carrying the naos of the God " +
                       "Atum,the procreator of all the gods and lords of Helioplis.";
        information[2]=" Pen- Fiery the Surveyor :\n" +
                "  Pen-Hery was responsibte for measuring the agricultural areas and determining the state properties, " +
                "  temples and indivtduals, he appears holding a twisted rope topped by the head of the ram of the god Amun," +
                "  ropes were among one of the main tools for measuring and determining the borders and large areas of the agricultural lands.\n" +
                "  New kingdom, 19th Dynasty / Karnak / Granite";
        information[3]=" King Thutmose III : Thutmose ill was one of the greatest warrior kings \n" +
                "  in ancient Egypt and leader of a unique military genius in planning battles and war operations that " +
                "  made  Egypt great power in the ancient world .He succeeded in establishing a great empire that extended " +
                "  from the Euphrates in the north and the 5 Cataract to the south.Moreover, he commissioned many architectural" +
                "  projects and erecated temples in the Delta , Memphis ,Karnak ,and,Aswan." +
                "  New Kingdom - 18th Dynasty (1550 - 1295 BC)/Karnak /Black granite.";
        information[4]=" king Akhenaten: When Amenhotep IV becomes a pharaoh, he summoned for a new doctrine in which \n" +
                " the attributes of all deities were combined in the same god Aten and called for peace and religious" +
                " tolerance,his doctrine had a great impact on the intellectual religious and artistic life in ancient Egypt.";
        information[5]=" Khonsu: Khonsu was the god of the moon and a member of the Theban Triad during the New Kingdom,\n" +
                " he was always depicted in the form of a young man carrying a moon disk over his head and a characterisac " +
                " braid of youth. He was a symbol of the youth, vitality and vigor of the reigning king. " +
                " The features of the statue indicate that it dates back to the reign of Tutankhamen, as it bears the personal features of the King. \n" +
                " New Kingdom, 18 Dynasty (Ss0 -1295 BC)/Kanak-Temple of Khonsu / Granite";
        information[6]=" God Nilus : The god Nilus was a symbol of the Nile river , \n" +
                " this statue is one of the rare pieces that depicts him in the form of a man leaning on a hippo over a rock " +
                "from which the water flows , he is surrounded by a group of children symbolizing the high level of the flood ." +
                " Roman Period / Qena / Marble.";
        information[7]="";
        information[8]=" King Fouad I ( 1868-1936 ): \n" +
                " The son of Khedive Ismail and the grandson of Muhammad Ali Pasha , he was educated at the private school of \n" +
                " Abdin Palace and the Turin Military School . He held the position of the Military Attaché in Vienna , \n" +
                " then the chief aide - de - camp of Khedive Abbas Helmy II , \n" +
                " and then took over the rule of Egypt in 1917 after the death of Sultan Hussein Kamel . \n" +
                " After the 1919 revolution and the declaration of Egypt as an independent kingdom , \n" +
                " he changed his title in 1922 to The King of Egypt , Nubia , Kordofan and Darfur . \n" +
                " King Fouad was interested in cultural life as he founded the Egyptian University in 1908 , \n" +
                " and the Royal Society for Economics , Statistics and Legislation . He also ordered the construction of the\n" +
                " parliament building . During his reign , the country's first constitution was established in 1922 , \n" +
                " and the first popular ministry was formed , headed by Saad Pasha Zaghloul , \n" +
                " and the treaty of 1936 was signed between Egypt and England , which recognizes Egypt as an independent country .";
        information[9]=" The vizier Paser:  Paser lived during the reign of Seti I ," +
                " where he held the title of the sole companion of the king and held many positions as the royal palace advisor , \n" +
                " the governor of the city Thebes , and who receives the tribute of the foreign lands for the king . \n" +
                " Then , during the reign of Ramses II , he became a judge , a seal bearer and deputy of the king in Nubia where \n" +
                " he supervised the construction works of the temple of Abu Simbel . He also assumed the position of high priest and \n" +
                " overseer of the Karnak temple until his death in the 25th year of the reign of Ramses II . Paser appears \n" +
                " in this statue carrying an altar topped by the head of a ram , the symbol of Amun Ra Lord of Karnak . \n" +
                " New Kingdom - 1 9 th Dynasty - reign of Ramesses ( 1279-12180 ) / karnak / Black Granite";
        information[10]=" Sphinxof_theking_Amenemhat_III:  The statues of the Sphinx represent the living king sitting on the " +
                " throne as the image of the god \" Shu \" , which was always depicted in the form of a crouching lion controlling" +
                " the borders of the universe, and this statue was one of the statues of King Amenemhat III that surrounded " +
                " the procession road in front of his great temple in Hawara. The Middle Kingdom - The Divine Dynasty (1795-1795 BC).";
        information[11]=" Amon-Ra : the king of the gods. Amun-Ra was the most important and most famous deity in ancient Egypt," +
                " if he was the main deity of the state in the modern and the middle ages, who bore the title of King of the Gods," +
                " and we worshiped Karnak, the main center of his worship in ancient Egypt.";
       information[12]=" Senenmut : Senenmut served as a close advisor and architect for the ruler, Hatshepsut. \n" +
               " He was trusted enough to be the tutor of Hatshepsut's daughter, Neferura, who is shown with Senenmut in this statue. \n" +
               " Senenmut designed and oversaw the construction of Hatshepsut's memorial temple at Deir el- Bahari as well as other \n" +
               " buildings in Karnak temple.New Kingdom - 18th Dynsty (1550 - 1295 BC)/Karnak temple/ Granite.";
       information[13]=" Pen Menkh_The_GovernerOf Dendara : he Greco-Roman era, the ruler of the city of Dendera during \n" +
               " the reign of Emperor Augustus, called Ibn Mankh, and the statue shows a mixture of the influence of ancient Egyptian\n" +
               " art and Hellenistic art.";
        information[14]=" Captive's statuettes: The figures of captives were made of different materials to be used in the ritual of\n" +
                " Protecting the Land and the King inside the temple. Thus, spells were recited on them and then tied with ropes \n" +
                " and placed in the fire to destroy the enemies of Egypt. Moreover, they were buried in the corners of the \n" +
                " temples or forts to eliminate their evil as welt .\n" +
                " New Kingdom - 19th Dynasty (1295 -1186 BC) / Tura el-Asmant / Mud";
        information[15]=" King Fouad I ( 1868-1936 ): The son of Khedive Ismail and the grandson of Muhammad Ali Pasha , \n" +
                " he was educated at the private school of Abdin Palace and the Turin Military School . \n" +
                " He held the position of the Military Attaché in Vienna , \n" +
                " then the chief aide - de - camp of Khedive Abbas Helmy II , \n" +
                " and then took over the rule of Egypt in 1917 after the death of Sultan Hussein Kamel . \n" +
                " After the 1919 revolution and the declaration of Egypt as an independent kingdom , \n" +
                " he changed his title in 1922 to The King of Egypt , Nubia , Kordofan and Darfur . \n" +
                " King Fouad was interested in cultural life as he founded the Egyptian University in 1908 , \n" +
                " and the Royal Society for Economics , Statistics and Legislation . \n" +
                " He also ordered the construction of the parliament building . During his reign , \n" +
                " the country's first constitution was established in 1922 , and the first popular ministry was formed , \n" +
                " headed by Saad Pasha Zaghloul , and the treaty of 1936 was signed between Egypt and England , \n" +
                " which recognizes Egypt as an independent country .";
               information[16]=" Statue of the Sphinx: Statue of Sphinx, which has no inscriptions indicating  its\n" +
                       " archaeological history clearly. This statue is a continuation of his though of the Pharaonic Sphinxes, " +
                       " as it was common in the Ptolemaic Period to place small statues of the Sphinx in front of the temples to be\n" +
                       " used for protection and guarding. Kom Ombo, Sandstone, Ptolemaic period.";
               information[17]=" Chair from the tomb of Queen Hetepheres: old kingdom, dynasty 4 Reign of king khufu. " +
                       " Ca. 2551-2528 BC From the Giza plateau. Queen Hetephere's tomb contained a magnificient collection of " +
                       " wooden furniture including this fine example of a guilded chair. The chair is decorated with delicate gold leaf," +
                       " giving it an eternal lustre.  The gilded frame surronds a plain, solid wood panel.";
        information[18]=" A Queen in the form of the Sphinx: This statue is considered one of the oldest statues made in the \n" +
                " form of the Sphinx for one of the ancient Egyptian queens, it is attributed to \n" +
                " Queen Heterepheres II the daughter of the  King Khufu, this rare form statue of queens may indicate \n" +
                " her assumption of the throne, what indeed expressed the Egyptians appreciirtion for women, and their reverence \n" +
                " for her as a mother, a sister, a wife, a ruler and a goddess as well.";
        information[19]=" The \"Kiswa\" Covering of the Holy Kaaba: Manufacture of the \"Kiswa\" covering of the Holy Kaaba is considered \n" +
                " one of the greatest and honorable deeds in Arab and Islamic culture. The tradition of covering the Kaaba goes back to \n" +
                " the King \"Tubba As'ad al-Kamel\" of the Himyarite Kingdom (387-430 AD) as the Arab traditions attributed to him the first \n" +
                " covering of the whale Kaaba before Islam, and this tradition continued to the present day. Noteworthy, the drape of Kaaba \n" +
                " varied between cotton, velour, linen, and silk. Moreover, its color switched between white, red, green, and yellow until \n" +
                " the Abbasid Caliph \"al-Ma'mun\" (813 - 833 AD) established the current practice of dressing the Kaaba once a year with \n" +
                " black silk. Since the reign of the Caliph \"Abu Bakr al-Siddiq\", making the Kiswa varied between Egypt, Damascus, and Yemen,\n" +
                " but during the reign of \"Al-Malik as-Salih Najm al-Din Ayyub\" (1240-1249 AD), Egypt retained the honor of making \n" +
                " the Kiswa and sending it annually to Mecca. Therefore, many textile workshops were established in Tennis, Tuna, and Shata \n" +
                " for its manufacture. Noteworthy, the last Kiswa workshop was the \"Dar al-Kiswa al-Musharrafah\" established by \"Muhammad Ali\"\n" +
                " in al-Khurunfash district in (1818 AD) that included hundreds of the most skilled workers of textile and embroidery.";
        information[20]=" Muhammad Ali Pasha: (1769 -1849) He was born in \"Kavala\" in Macedonia, \n" +
                " and came to Egypt with an Ottoman military force to fight the French expedهtion Later in 1805 the Egyptians those \n" +
                " him as viceroy of Egypt and subsequently, he eliminated the dangers of the Mamluks and the English ambitions in Egypt. \n" +
                " Then he seized the Sudan, the Levant, the Arabian Peninsula, and threatened the Ottoman Empire\n" +
                " with his troops until the Treaty of London in 1840 granted him the right to become ruler of Egypt and the \n" +
                " rule of Egypt is hereditary to his family Muhammad All is considered the founder of modern Egypt,\n" +
                " where he established the first Egyptian modern army and naval fleet. \n" +
                " He developed military schools and industries, civil industries such as textiles \n" +
                " and sugar He also sent scientific missions abroad and set up high schools. \n" +
                " Moreover, He built the Benevolent Bridges, dams, and canals to develop irrigation system and expand the .\n" +
                " agricultural area, introduced many new crops, and built modern roads and urban expansion throughout Egypt";
        information[21]=" The Femal Peasent: This statue is considered one of the prominent works of the artist Mahmoud Mokhtar,\n" +
                " in which he focused the position of the female peasant and her role as one of\n" +
                " the main  roles of women in Egyptian society, in the past and present.";
        information[22]=" A Silo: Silos were used to store grains, mainly wheat and barley. \n" +
                " The grains were poured in bon the top and taken out from lower down. \n" +
                " Both openings were sealed with wood and /or day. \n" +
                " This silo is one of the earliest surviving portable examples.";
        information[23]=" A Silo: Silos were used to store grains, mainly wheat and barley. \n" +
                " The grains were poured in bon the top and taken out from lower down. \n" +
                " Both openings were sealed with wood and /or day. \n" +
                " This silo is one of the earliest surviving portable examples.";
        information[24]=" Nazlet Khater Skeleton :  This skeleton was found buried near Nazlet Khater - Sohag Governorate . \n" +
                " It is for a young man who lived 35 thousand years ago , and it appears from his skeleton that he had \n" +
                " enjoyed a distinguished height and a strong body , one of his stone tools was discovered beside him .\n" +
                " Upper Paleolithic / Nazlet Khater.";
        information[25]=" Funerary Masks: These two painted cartonnage masks were found in Sennedjem's tomb. One of them belongs " +
                " to his wife, Iyneferti,and the other probably belongs to one of his daughters in law. These masks were placed" +
                " over the mummified and wrapped face in order to identify them and to protect the body within.\n" +
                " New Kingdom- 19th Dynasty (1295 - 1106 BC) Deir el-Madina, Luxor";
        information[26]="Purification with water: Upon his arrival from the other world, \n" +
                " the sun god purifies himself in eastern horizon before his shining in heaven, where the four gods Horus, \n" +
                " the lord of the north Seth, the lord of the south Dewen-anwy, the lord of the east\n" +
                " and Thoth the lord of the west pour the water of life and power over him from the four corners of the universe. \n" +
                " This rare statue depicts king Amenhotep II assimilated with the sun god in his shining in the moment \n" +
                " of his purification in the horizon.";
        information[27]="The birth of isis: The unique plaque was found near the temple of dendara, it probably depicts \n" +
                " the goddess Nut giving birth to the goddess isis on the birth chair, while the goddess of birth with the head \n" +
                " of the cow supervises the delivering process.";
        */

        switch (x1)
        {
            case 1:
                info.setText(getString(R.string.exhibit_1));
                break;
            case 2:
                info.setText(getString(R.string.exhibit_2));
                break;
            case 3:
                info.setText(getString(R.string.exhibit_3));
                break;
            case 4:
                info.setText(getString(R.string.exhibit_4));
                break;
            case 5:
                info.setText(getString(R.string.exhibit_5));
                break;
            case 6:
                info.setText(getString(R.string.exhibit_6));
                break;
            case 7:
                info.setText(getString(R.string.exhibit_7));
                break;
            case 8:
                info.setText(getString(R.string.exhibit_8));
                break;
            case 9:
                info.setText(getString(R.string.exhibit_9));
                break;
            case 10:
                info.setText(getString(R.string.exhibit_10));
                break;
            case 11:
                info.setText(getString(R.string.exhibit_11));
                break;
            case 12:
                info.setText(getString(R.string.exhibit_12));
                break;
            case 13:
                info.setText(getString(R.string.exhibit_13));
                break;
            case 14:
                info.setText(getString(R.string.exhibit_14));
                break;
            case 15:
                info.setText(getString(R.string.exhibit_15));
                break;
            case 16:
                info.setText(getString(R.string.exhibit_16));
                break;
            case 17:
                info.setText(getString(R.string.exhibit_17));
                break;
            case 18:
                info.setText(getString(R.string.exhibit_18));
                break;
            case 19:
                info.setText(getString(R.string.exhibit_19));
                break;
            case 20:
                info.setText(getString(R.string.exhibit_20));
                break;
            case 21:
                info.setText(getString(R.string.exhibit_21));
                break;
            case 22:
                info.setText(getString(R.string.exhibit_22));
                break;
            case 23:
                info.setText(getString(R.string.exhibit_23));
                break;
            case 24:
                info.setText(getString(R.string.exhibit_24));
                break;
            case 25:
                info.setText(getString(R.string.exhibit_25));
                break;
            case 26:
                info.setText(getString(R.string.exhibit_26));
                break;
            case 27:
                info.setText(getString(R.string.exhibit_27));
                break;
            case 28:
                info.setText(getString(R.string.exhibit_28));
                break;
        }
        // info.setText(information[x-1]);


        FloatingActionButton audio=(FloatingActionButton) findViewById(R.id.floatingActionButton4);
        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mPlayer==null)
                {
                    mPlayer = MediaPlayer.create(getApplicationContext(), music[x-1]);
                    mPlayer.start();
                }
                else if(mPlayer!=null) {
                    mPlayer.pause();
                }


            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.language_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.arLanguage:
                String arLang = "ar";
                setLocal(arLang);
                return true;
            case R.id.enLanguage:
                String enLang = "en";
                setLocal(enLang);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void setLocal(String language)
    {
        Locale locale =new Locale(language);
        Locale.setDefault(locale);
        Resources resources = getResources();
        Configuration config =resources.getConfiguration();
        config.setLocale(locale);
        resources.updateConfiguration(config,resources.getDisplayMetrics());
        //to refresh
        recreate();
    }
}