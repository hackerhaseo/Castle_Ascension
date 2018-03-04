package com.example.castleascension;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class game_main extends Activity {
    
    String[] main = {
            //Chapter 1 - Pawn (Arrays 0 - 17)
            "A princess was kidnapped by the Dark Lord.",
            "You, a brave Knight, attempting to rescue the princess, will take on a series of challenges in order to ascend the castle.",
            "In this castle filled with Gatekeepers, will you be able to survive with the princess in hand?",
            "You: So, you're a Gatekeeper, huh?",
            "Gatekeeper: Indeed. My name is Pawn. You're here to retrieve the princess, is it not?",
            "You: Yeah, that's right! Now, stand down or else!",
            "Pawn: Or else what?",
            "You: Or else...",
            "You: ...I'll knock YOU down!",
            "Pawn: I like your guts, o brave Knight. Let's see how well you can entertain me!",
            "Pawn: Ugghh... You beat me...",
            "Pawn: You fought well.",
            "Pawn: You might have a chance to save the princess after all.",
            "Pawn: Now, go! Show me just how far you'll go!",
            "You: ...",
            "You: Pawn just disappears into thin air.",
            "You: Perhaps I should get going as well.",
            //Chapter 2 - Bishop (Arrays 18 - 29)
            "You: I proceeded deeper into the castle...",
            "You: ...and onto the next room. Until I met...",
            "Gatekeeper: Welcome, my dear visitor. You may call me Bishop.",
            "You: Bishop... I think I know what the other Gatekeepers' names are based off now.",
            "Bishop: Hahaha. What a sharp boy we have here.",
            "Bishop: But enough with the chatter. Do you think you can pass through me?",
            "You: I won't know unless I try! *unsheathes sword*",
            "You: Game on!",
            "Bishop: Well done, my dear visitor.",
            "Bishop: Until we meet again... in the afterlife.",
            "You: He vanished as well...",
            "You: Time to get a move on.",
            //Chapter 3 - Daichi (Arrays 30 - 45)
            "You: Arriving on another room, someone seems to be blocking my path...",
            "Gatekeeper: Who goes there!?",
            "You: I'm just a Knight trying to save the princess.",
            "Gatekeeper: Heh! Trying to act cool, eh!?",
            "Gatekeeper: Well, too bad! 'Cuz your path ends here!",
            "Gatekeeper: I, Daichi, the Earth Guardian, shall take you on!",
            "You: And here I thought all of their names came from chess pieces...",
            "You: Had enough yet?",
            "Daichi: Damn... you...",
            "You: Aaand he disappears as well.",
            "You: Huh?",
            "You: What the-- my sword is taking in Daichi's Earth powers!",
            "You:... Now this is new. I also gained some knowledge on how to use this new power.",
            "You: So... shall I call my sword 'Sword of Earth' now?",
            "You: *sigh* I don't have time for this!",
            "You: On to the next floor!",
            //Chapter 4 - Rook (Arrays 46 - 60)
            "...",
            "Gatekeeper: Welcome, brave Knight, to the second floor of the castle.",
            "Gatekeeper: I didn't think you could make it this far.",
            "You: W-Who's there!?",
            "You: Argh! What is this blinding light!?",
            "Gatekeeper: Introducing...",
            "*drum rolls*",
            "Gatekeeper: ...me, the almighty Rook!",
            "You: I see. So we're back to chess pieces, huh.",
            "Rook: Whatever do you mean...",
            "Rook: Now, witness the power of my unfaltering loyalty to the Dark Lord!",
            "Rook: Prepare yourself!",
            "You: *unsheathes sword* Game on!",
            "Rook: It seems... your loyalty to the princess is stronger than mine...",
            "You: ...Yes. Always.",
            //Chapter 5 - Knight (Arrays 61 - 76)
            "You: Delving farther, I encountered someone I expected to see soon enough...",
            "Gatekeeper:...",
            "You: You're the same as me, huh.",
            "Knight: ...",
            "Knight: *unsheathes sword*",
            "You: I see you're not a talkative kind...",
            "You: *unsheathes sword*",
            "You: Game on.",
            "Knight: ...",
            "You: ...",
            "Knight: ...",
            "Knight: Well done. Go save the princess.",
            "You: Wha--!? ...He disappeared.",
            "You: Why did he cheer me on?",
            "You: And that voice...",
            "You: It seems so familiar...",
            //Chapter 6 - Honoo (Arrays 77 - 122)
            "You: ...",
            "You: I can see the staircase leading to the next floor.",
            "Gatekeeper: Not so fast.",
            "You: ...",
            "Gatekeeper: The Fire Guardian, Honoo, is now at your service.",
            "You: I see. For every two chess pieces I defeat, an Elemental Guardian will appear...",
            "You: *unsheathes sword* Let's get this over with.",
            "Honoo: I said, 'Not so fast'.",
            "You: !",
            "You: It's suddenly got hot in here...",
            "You: Even using Daichi's power probably won't handle this heat!",
            "Honoo: Of course it won't. You do know that Earth is weak against Fire, don't you?",
            "You: Tch...",
            "Honoo: So settle down. I don't even want to fight in the first place.",
            "You: Then get out of my way.",
            "Honoo: Even if I'm bored, I still have to uphold my duty.",
            "You: Then--!",
            "Honoo: Don't be so hasty. I just wanna play a game.",
            "You: A... game...?",
            "Honoo: Yes. A game. Of rock-paper-scissors.",
            "You: ...",
            "Honoo: What? Guarding a floor can be pretty boring, y'know?",
            "Honoo: Let's put it this way.",
            "Honoo: If you win, I'll let you pass and lend you my power.",
            "Honoo: But, if you lose...",
            "Honoo: ...I'll incinerate you right on the spot.",
            "Honoo: And besides, you're tired from all this fighting, aren't you?",
            "Honoo: This'll be a nice change of pace, if you ask me.",
            "You: ...",
            "You: Alright. If you really want to lose that badly, then be my guest.",
            "Honoo: Okay, then. Game on.",
            "You: Hey, that's MY line!",
            "Honoo: Now that was quite entertaining.",
            "You: I win, so let me pass now.",
            "Honoo: I told you not to be hasty.",
            "Honoo: And besides, there's still one more thing I promised to give, am I right?",
            "You: !",
            "You: What are you doing!? Don't kill yourself!",
            "Honoo: I had fun playing with you, kid.",
            "You: Noooo!!!",
            "You: ...",
            "You: !",
            "You: His power... is being infused into my sword...",
            "Honoo: Use me well.",
            "You: ...I will.",
            "You: Princess... Please wait a little longer...",
            //Chapter 7 - Mizu (Arrays 123 - 152)
            "You: ...",
            "You: This room's a little bit different...",
            "Gatekeeper: Of course it is.",
            "You: !",
            "Gatekeeper: Heehee. I'm a girl, after all.",
            "Gatekeeper: The name's Mizu, the Water Guardian. You better remember it, okay?~",
            "You: Dammit.",
            "Mizu: Huh? What's wrong?",
            "You: And here I thought I was going to fight another chess piece...",
            "Mizu: Hey! You should be grateful that it's me you're facing right now and not the Queen!",
            "You: The Queen, huh. Is she powerful?",
            "Mizu: Stop asking about anyone and just focus your attention to me!",
            "You: ...But you're the one who--",
            "Mizu: ENOUGH!",
            "Mizu: Now you made me angry! Witness my wrath's power!",
            "You: ...",
            "You: I'm still confused as to how we got in this situation.",
            "You: Oh, well...",
            "You: *unsheathes sword*",
            "You: Game on...",
            "You: ...I guess.",
            "Mizu: Gaaah! How.. dare you raise your sword at a girl...!",
            "Mizu: And you call yourself a Knight!",
            "You: ...I don't really care. I only care about the princess.",
            "Mizu: Hah! Let's see you break your way against the Queen...",
            "You: I'm gonna ask you again. Is she--",
            "...",
            "You: Well, that was an ill-mannered way of avoiding my question.",
            "You: Bah, who cares. I got her powers anyway.",
            "You: Next floor, here we go!",
            //Chapter 8 - Kaze (Arrays 153 - 171) Start of unstable array count
            "Gatekeeper: So... you're here.",
            "You: So it is.",
            "Gatekeeper: I am Kaze, the Wind Guardian.",
            "Kaze: Hmm... Somehow, I can feel my comrades' powers in your sword...",
            "You: My sword absorbed their powers after I beat them.",
            "Kaze: Just how can your sword absorb the powers of the Elementals?",
            "You: Who knows?",
            "Kaze: ...I see.",
            "Kaze: By my honor as one of the Elementals, and as one of their friends...",
            "Kaze: I shall release their powers from your grasp!",
            "Kaze: ...You've defeated me.",
            "You: ...",
            "You: By my honor...",
            "You: I would like to seek permission from you...",
            "You: to use your powers in order to save the princess.",
            "Kaze: Hmph. Very well. By having me, you can combine elements to create more powerful moves in battle.",
            "Kaze: I'll prove to be very useful on your quest. At least I'd get to aid a noble Knight such as you.",
            "Kaze: And with this... I have no regrets...",
            "You: ...",
            //Chapter 9 - Queen (Arrays 172 - 197)
            "You: ...",
            "You: Another dark room...",
            "Gatekeeper: Well, let's light it up, shall we?",
            "You: !",
            "Gatekeeper: Well, hello there.",
            "Gatekeeper: I am Queen.",
            "You: Queen!? Mizu mentioned about you a few minutes ago.",
            "You: She didn't get to answer my question, so let me ask you!",
            "You: Are you powerful!?",
            "Queen: Well, you've already witnessed my powers, boy.",
            "You: What...?",
            "Queen: You see, all of the Elementals are being controlled by yours truly.",
            "You: So... they're not guarding this castle willingly?",
            "Queen: That is correct.",
            "Queen: I can also control ALL of their powers. Having sympathy for them now?",
            "You: ...",
            "You: I...",
            "You: *unsheathes sword* I will prevail!",
            "Queen: Heehee, we'll see about that.",
            "Queen: How... How can a mere Knight--!?",
            "You: ...",
            "You: The fate of the Elementals shouldn't be like this.",
            "You: So in exchange for their sacrifice...",
            "You: I will use their powers for good.",
            "You: Princess. I'm almost there.",
            "You: I will move forward. Even if the path leads to a dark one.",
            //Chapter 10 - King (Arrays 198 - 239)
            "You: ...",
            "Dark Lord: You have done well in making it this far.",
            "You: !",
            "Dark Lord: I didn't think you would be able to overcome every single one of my Gatekeepers.",
            "You: It takes a lot more than that to stop me from saving the princess!",
            "Dark Lord: Hahaha! Indeed! I, the Dark Lord King, accepts your strength!",
            "King: Now, before we begin our fated duel, may I ask for thy name?",
            "You: It's...",
            "You!",
            "King: ...",
            "King: Me?",
            "You: No, you idiot! It's You!",
            "King: ...",
            "King: WHAAAAAT!?",
            "King: It's right on most of your dialogues this whole time!?",
            "You: Got a problem with that?",
            "King: Well, no, but...",
            "King: *sigh* Putting that aside...",
            "King: If I grant you the position of being my Royal Knight for my world conquest...",
            "King: ...would you accept?",
            "You: ...",
            "You: No. All I want is the princess.",
            "King: True. In order to conquer the world, I need the princess' power.",
            "King: And you saving her will invalidate my goal...",
            "King: So it is impossible after all...",
            "King: You must've known my powers by now, haven't you?",
            "You: ?",
            "King: Remember the Knight you fought before?",
            "King: That was actually a copy of you.",
            "King: So to make things short, I can create copies of ALL the chess pieces!",
            "You: I see... So I'm also one of you...",
            "You: *unsheathes sword* But that doesn't mean that I'm evil!",
            "You: GAME ON!",
            "King: H-How is this possible!?",
            "King: Where on earth did you get the powers of the Elementals!?",
            "King: They're supposed to be in different parts of the world!",
            "You: Didn't you know? Queen controlled them into being her personal Gatekeepers.",
            "King: I didn't know such a thing!",
            "You: So that means she must've planned to use the Elementals against you eventually.",
            "King: Queen... You...",
            "King: TRAITOOOOOOR!!!",
            "You: ...Goodbye.",
            //Epilogue (Arrays 240 - 255)
            "...",
            "You: After I defeated King, I quickly searched for the princess. And then...",
            "You: Princess!",
            "Princess: Ungh...",
            "You: Princess! Princess Stella!",
            "Stella: You... Is that you...?",
            "You: Yes! It's me, your Highness! You're safe now.",
            "Stella: You've defeated the Dark Lord?",
            "You: Yes, your Highness.",
            "Stella: Your brave act must be rewarded.",
            "Stella: Before we come back to the palace, what would you wish of me to be granted upon you?",
            "Stella: Wealth? An army? Hundreds of ships? Name it.",
            "You: I want...",
            "You: ...",
            "...",
            "You.",
            //Credits (Arrays 256 - 262)
            "-THE END-",
            "-Credits-",
            "Joshua Daniel C. Tubalinal - Programmer & Storywriter",
            "Kian Jacob Anthony C. Tubalinal - Main Theme & 1st Battle Theme Composer",
            "Jairo Maverick C. Tubalinal - Characters & Background Editor/Designer",
            "-THANK YOU FOR PLAYING-",
            " "
    };
    String[] battle11 = {
            "STRIKE!",
            "PARRY!",
            "Just watch him."
    };
    String[] battle12 = {
            "Wait for him to recover.",
            "STRIKE NOW!",
            "Retreat!"
    };
    String[] battle21 = {
            "Stay in the center.",
            "Move to the left.",
            "Move to the right."
    };
    String[] battle22 = {
            "Heed his advice.",
            "Advance. Slowly.",
            "Take the chance!"
    };
    String[] battle31 = {
            "Jump!",
            "Slash the spikes!",
            "Go around it!"
    };
    String[] battle32 = {
            "Like hell I will!",
            "I think it's worth a try!",
            "Hah! Like your bullets can graze me!"
    };
    String[] battle33 = {
            "Wait for the Earth Shield to crumble.",
            "Break it!",
            "Go around it."
    };
    String[] battle41 = {
            "Dodge to the right!",
            "Dodge to the left!",
            "Intercept him!"
    };
    String[] battle42 = {
            "Block it!",
            "Earth Sword, Unleash!",
            "Dodge it!"
    };
    String[] battle43 = {
            "Earth Shield, Activate!",
            "Dodge it!",
            "Surrender..."
    };
    String[] battle51 = {
            "Lunge forward.",
            "Strike to the left.",
            "Strike to the right."
    };
    String[] battle52 = {
            "Lunge forward.",
            "Strike to the left.",
            "Strike to the right."
    };
    String[] battle53 = {
            "Lunge forward.",
            "Strike to the left.",
            "Strike to the right."
    };
    String[] battle61 = {
            "Rock!",
            "Paper!",
            "Scissors!"
    };
    String[] battle62 = {
            "Rock!",
            "Paper!",
            "Scissors!"
    };
    String[] battle63 = {
            "Rock!",
            "Paper!",
            "Scissors!"
    };
    String[] battle71 = {
            "Ground Spikes!",
            "Earth Shield, Activate!",
            "From the ground, I create an Earth Board!"
    };
    String[] battle72 = {
            "Jump, duck, roll, flip!",
            "Roll, jump, duck, flip!",
            "Duck, flip, roll, jump!"
    };
    String[] battle73 = {
            "Activate Fire Sword and stab the sword into the water.",
            "Create an Earth Pillar below your feet to elevate you.",
            "Swim towards Mizu to attack her."
    };
    String[] battle74 = {
            "Earth Sword, Unleash!",
            "Dodge them all!",
            "Earth Shield, Activate!"
    };
    String[] battle81 = {
            "Strike the one on the front.",
            "Strike the one on the left.",
            "Strike the one on the right."
    };
    String[] battle82 = {
            "HONOO!",
            "MIZU!",
            "DAICHI!"
    };
    String[] battle83 = {
            "Sacred Water!",
            "Fire Sword, Unleash!",
            "Earth Shield, Activate!"
    };
    String[] battle84 = {
            "DAICHI!",
            "HONOO!",
            "MIZU!"
    };
    String[] battle85 = {
            "MIZU!",
            "DAICHI!",
            "HONOO!"
    };
    String[] battle91 = {
            "Earth Shield, Activate!",
            "Go, Water Dragon!",
            "Fire Sword, Unleash!"
    };
    String[] battle92 = {
            "Howling Wind!",
            "Earth Shield, Activate!",
            "Water Tentacles!"
    };
    String[] battle93 = {
            "Earth-Fire Combination, MOLTEN SHIELD!",
            "Fire-Wind Combination, FIRE TORNADO!",
            "Wind-Earth Combination, ROCK TORNADO!"
    };
    String[] battle94 = {
            "Wind-Water Combination, HURRICANE!",
            "Water-Earth Combination, MUD CANNONBALLS!",
            "Earth-Wind Combination, SANDSTORM!"
    };
    String[] battle95 = {
            "Sacred Water!",
            "CHAAARGE!!!",
            "Wait for the tornado to disperse."
    };
    String[] battle101 = {
            "STRIKE!",
            "PARRY!",
            "Just watch him."
    };
    String[] battle102 = {
            "Stay in the center.",
            "Move to the left.",
            "Move to the right."
    };
    String[] battle103 = {
            "Earth Shield, Activate!",
            "Dodge it!",
            "Surrender..."
    };
    String[] battle104 = {
            "Lunge forward.",
            "Strike to the left.",
            "Strike to the right."
    };
    String[] battle105 = {
            "Sacred Water!",
            "CHAAARGE!!!",
            "Wait for the tornado to disperse."
    };
    String[] hint1 = {
            "Pawn: En Garde!",
            "Pawn: *huff* Gotta take a breather... *huff*"
    };
    String[] hint2 = {
            "Bishop: From my hands... I cast Lightning!",
            "Bishop: Time to recharge... Don't come near me now... Or you might get hurt..."
    };
    String[] hint3 = {
            "Daichi: Here it comes! Ground Spikes!",
            "Daichi: Try to catch my Rock Bullets! It might come in handy!",
            "Daichi: With my power, I summon my Earth Shield from the ground!"
    };
    String[] hint4 = {
            "Rook: Here I go! Vertical Slash!",
            "Rook: Take this! My unstoppable Horizontal Smash!",
            "Rook: Get ready for my ultimate projectile attack, Sacred Cross!"
    };
    String[] hint5 = {
            "Knight: ...",
            "Knight: ....",
            "Knight: ....."
    };
    String[] hint6 = {
            "Honoo: I will go with... SCISSORS.",
            "Honoo: How about I choose... PAPER?",
            "Honoo: ROCK... is the way to go for me."
    };
    String[] hint7 = {
            "Mizu: I summon my Water Dragon! Water Dragon, use Mega Torrent!",
            "Mizu: Let's see if you can dodge my Water Tentacles!",
            "You: What the--!? This room's filling up with water!",
            "Mizu: Locked on to target... Now, go! Ice Shards!"
    };
    String[] hint8 = {
            "Kaze: Born from my blinding speed, I create these Afterimage Clones! Can you guess the real me?",
            "Kaze: I dare you to get away unscathed from a barrage of my Gust Slash!",
            "Kaze: Howling Wind! Now, with you being pushed back, you'll never be able to reach me!",
            "Kaze: A thousand blades in the air... Cutter Leaves!",
            "Kaze: Can you keep up with my Sonic Strikes!?"
    };
    String[] hint9 = {
            "Queen: Fire-Earth Combination, METEOR!!!",
            "Queen: Water-Fire Combination, FOG!!!",
            "Queen: Wind-Water Combination, ICE TORNADO!!!",
            "Queen: Fire-Wind Combination, FIREWALL!!!",
            "Queen: Water-Wind Combination, WHIRLWIND-PROTECTED HEALING AREA!!!"
    };
    String[] hint10 = {
            "Pawn: En Garde!",
            "Bishop: From my hands... I cast Lightning!",
            "Rook: Get ready for my ultimate projectile attack, Sacred Cross!",
            "Knight: ....",
            "Queen: Water-Wind Combination, WHIRLWIND-PROTECTED HEALING AREA!!!"
    };

    private Button btn, btn1, btn2, btn3, yes, no, back, sounds, skip;
    private TextView hint, you, enemy, confirm;
    private ImageView bg;
    private Random shuffle = new Random();
    private MediaPlayer bgm, click, hit, dmg, heal, swordClash, drumRoll, zap, crumble, jump, splash;
    
    int ctr, ctr2, hp, enemyHp, level=1, holder=2;
    Boolean checker=false, soundChecker=true, instantDeath=false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_game);
        btn = findViewById(R.id.btn);
        bg = findViewById(R.id.bg);
        hint = findViewById(R.id.hint);
        hint.setVisibility(View.GONE);
        btn1 = findViewById(R.id.btn1);
        btn1.setVisibility(View.GONE);
        btn2 = findViewById(R.id.btn2);
        btn2.setVisibility(View.GONE);
        btn3 = findViewById(R.id.btn3);
        btn3.setVisibility(View.GONE);
        you = findViewById(R.id.you);
        you.setVisibility(View.GONE);
        enemy = findViewById(R.id.enemy);
        enemy.setVisibility(View.GONE);
        confirm = findViewById(R.id.confirm);
        confirm.setVisibility(View.GONE);
        yes = findViewById(R.id.yes);
        yes.setVisibility(View.GONE);
        no = findViewById(R.id.no);
        no.setVisibility(View.GONE);
        back = findViewById(R.id.back);
        sounds = findViewById(R.id.sounds);
        skip = findViewById(R.id.skip);
        skip.setVisibility(View.GONE);
        Intent gameStart = getIntent();
        Boolean toggle = gameStart.getBooleanExtra("toggle", false);
        bgm = MediaPlayer.create(getApplicationContext(), R.raw.battle_theme1);
        click = MediaPlayer.create(getApplicationContext(), R.raw.click_sfx);
        hit = MediaPlayer.create(getApplicationContext(), R.raw.hit_sfx);
        dmg = MediaPlayer.create(getApplicationContext(), R.raw.damage_sfx);
        swordClash = MediaPlayer.create(getApplicationContext(), R.raw.clash_sfx);
        heal = MediaPlayer.create(getApplicationContext(), R.raw.heal_sfx);
        drumRoll = MediaPlayer.create(getApplicationContext(), R.raw.drumroll_sfx);
        zap = MediaPlayer.create(getApplicationContext(), R.raw.zap_sfx);
        crumble = MediaPlayer.create(getApplicationContext(), R.raw.crumble_sfx);
        jump = MediaPlayer.create(getApplicationContext(), R.raw.jump_sfx);
        splash = MediaPlayer.create(getApplicationContext(), R.raw.splash_sfx);
        bgm.setLooping(true);
        if(!toggle) {
            bgm.pause();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(checker) {
            bgm.pause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(checker) {
           bgm.start();
        }
    }

    //main button
    public void clickMe(View v) {
        click.start();
        if (!instantDeath) {
            btn.setText(main[ctr++]);
            if(ctr == 2) {
               bg.setImageResource(R.drawable.mc);
            }
            else if (ctr == 4) {
                hp = 3;
                enemyHp = 3;
                bg.setImageResource(R.drawable.pawn);
                bgm.start();
                checker = true;
            } else if (ctr == 11) {
                if (hp > 0 && enemyHp > 0) {
                    start();
                    ctr2 = (1 + shuffle.nextInt(holder) - 1);
                    if (ctr2 == 0) {
                        hint.setText(hint1[ctr2]);
                        btn1.setText(battle11[0]);
                        btn2.setText(battle11[1]);
                        btn3.setText(battle11[2]);
                    } else {
                        hint.setText(hint1[ctr2]);
                        btn1.setText(battle12[0]);
                        btn2.setText(battle12[1]);
                        btn3.setText(battle12[2]);
                    }
                    ctr--;
                } else {
                    if (hp == 0) {
                        dead();
                    } else {
                        bgm.pause();
                    }
                }
            } else if(ctr == 15) {
                bg.setImageResource(R.drawable.pawn_bg);
            } else if (ctr == 17) {
                bg.setImageResource(R.drawable.black);
            } else if (ctr == 18) {
                level = 2;
                hp = 3;
                enemyHp = 3;
                bgm = MediaPlayer.create(getApplicationContext(), R.raw.battle_theme2);
                bgm.setLooping(true);
                bgm.start();
            } else if (ctr == 19) {
                bg.setImageResource(R.drawable.bishop_bg);
            } else if (ctr == 20) {
                bg.setImageResource(R.drawable.bishop);
            } else if (ctr == 26) {
                if (hp > 0 && enemyHp > 0) {
                    start();
                    ctr2 = (1 + shuffle.nextInt(holder) - 1);
                    if (ctr2 == 0) {
                        hint.setText(hint2[ctr2]);
                        btn1.setText(battle21[0]);
                        btn2.setText(battle21[1]);
                        btn3.setText(battle21[2]);
                    } else {
                        hint.setText(hint2[ctr2]);
                        btn1.setText(battle22[0]);
                        btn2.setText(battle22[1]);
                        btn3.setText(battle22[2]);
                    }
                    ctr--;
                } else {
                    if (hp == 0) {
                        dead();
                    } else {
                        bgm.pause();
                    }
                }
            } else if (ctr == 28) {
                bg.setImageResource(R.drawable.bishop_bg);
            } else if (ctr == 30) {
                bg.setImageResource(R.drawable.earth_bg);
            } else if (ctr == 31) {
                hp = 3;
                enemyHp = 4;
                level = 3;
                holder = 3;
                bg.setImageResource(R.drawable.earth);
                bgm = MediaPlayer.create(getApplicationContext(), R.raw.battle_theme3);
                bgm.setLooping(true);
                bgm.start();
            } else if (ctr == 37) {
                if (hp > 0 && enemyHp > 0) {
                    start();
                    ctr2 = (1 + shuffle.nextInt(holder) - 1);
                    if (ctr2 == 0) {
                        hint.setText(hint3[ctr2]);
                        btn1.setText(battle31[0]);
                        btn2.setText(battle31[1]);
                        btn3.setText(battle31[2]);
                    } else if (ctr2 == 1) {
                        hint.setText(hint3[ctr2]);
                        btn1.setText(battle32[0]);
                        btn2.setText(battle32[1]);
                        btn3.setText(battle32[2]);
                    } else {
                        hint.setText(hint3[ctr2]);
                        btn1.setText(battle33[0]);
                        btn2.setText(battle33[1]);
                        btn3.setText(battle33[2]);
                    }
                    ctr--;
                } else {
                    if (hp == 0) {
                        dead();
                    } else {
                        bgm.pause();
                    }
                }
            } else if (ctr == 39) {
                bg.setImageResource(R.drawable.earth_bg);
            } else if (ctr == 45) {
                bg.setImageResource(R.drawable.black);
            } else if (ctr == 50) {
                bg.setVisibility(View.GONE);
                hp = 3;
                enemyHp = 4;
                holder = 3;
                level = 4;
            } else if (ctr == 52) {
                drumRoll.start();
            } else if (ctr == 53) {
                bg.setVisibility(View.VISIBLE);
                bg.setImageResource(R.drawable.rook);
                bgm = MediaPlayer.create(getApplicationContext(), R.raw.battle_theme4);
                bgm.setLooping(true);
                bgm.start();
            } else if (ctr == 59) {
                if (hp > 0 && enemyHp > 0) {
                    start();
                    ctr2 = (1 + shuffle.nextInt(holder) - 1);
                    if (ctr2 == 0) {
                        hint.setText(hint4[ctr2]);
                        btn1.setText(battle41[0]);
                        btn2.setText(battle41[1]);
                        btn3.setText(battle41[2]);
                    } else if (ctr2 == 1) {
                        hint.setText(hint4[ctr2]);
                        btn1.setText(battle42[0]);
                        btn2.setText(battle42[1]);
                        btn3.setText(battle42[2]);
                    } else {
                        hint.setText(hint4[ctr2]);
                        btn1.setText(battle43[0]);
                        btn2.setText(battle43[1]);
                        btn3.setText(battle43[2]);
                    }
                    ctr--;
                } else {
                    if (hp == 0) {
                        dead();
                    } else {
                        bgm.pause();
                    }
                }
            }
            else if(ctr == 61) {
                bg.setImageResource(R.drawable.black);
                level = 5;
                hp = 3;
                enemyHp = 5;
                holder = 3;
            }
            else if(ctr == 62) {
                bg.setImageResource(R.drawable.knight);
                bgm = MediaPlayer.create(getApplicationContext(), R.raw.battle_theme5);
                bgm.setLooping(true);
                bgm.start();
            }
            else if(ctr == 69) {
                if (hp > 0 && enemyHp > 0) {
                    start();
                    ctr2 = (1 + shuffle.nextInt(holder) - 1);
                    if (ctr2 == 0) {
                        hint.setText(hint5[ctr2]);
                        btn1.setText(battle51[0]);
                        btn2.setText(battle51[1]);
                        btn3.setText(battle51[2]);
                    } else if (ctr2 == 1) {
                        hint.setText(hint5[ctr2]);
                        btn1.setText(battle52[0]);
                        btn2.setText(battle52[1]);
                        btn3.setText(battle52[2]);
                    } else {
                        hint.setText(hint5[ctr2]);
                        btn1.setText(battle53[0]);
                        btn2.setText(battle53[1]);
                        btn3.setText(battle53[2]);
                    }
                    ctr--;
                } else {
                    if (hp == 0) {
                        dead();
                    } else {
                        bgm.pause();
                    }
                }
            }
            else if(ctr == 73) {
                bg.setImageResource(R.drawable.knight_bg);
            }
            else if(ctr == 77) {
                bg.setImageResource(R.drawable.black);
                level = 6;
                hp = 3;
                enemyHp = 6;
                holder = 3;
            }
            else if(ctr == 78) {
                bg.setImageResource(R.drawable.fire_bg);
            }
            else if(ctr == 81) {
                bg.setImageResource(R.drawable.fire);
                bgm = MediaPlayer.create(getApplicationContext(), R.raw.battle_theme6);
                bgm.setLooping(true);
                bgm.start();
            }
            else if(ctr == 109) {
                if (hp > 0 && enemyHp > 0) {
                    start();
                    ctr2 = (1 + shuffle.nextInt(holder) - 1);
                    if (ctr2 == 0) {
                        hint.setText(hint6[ctr2]);
                        btn1.setText(battle61[0]);
                        btn2.setText(battle61[1]);
                        btn3.setText(battle61[2]);
                    } else if (ctr2 == 1) {
                        hint.setText(hint6[ctr2]);
                        btn1.setText(battle62[0]);
                        btn2.setText(battle62[1]);
                        btn3.setText(battle62[2]);
                    } else {
                        hint.setText(hint6[ctr2]);
                        btn1.setText(battle63[0]);
                        btn2.setText(battle63[1]);
                        btn3.setText(battle63[2]);
                    }
                    ctr--;
                } else {
                    if (hp == 0) {
                        dead();
                    } else {
                        bgm.pause();
                    }
                }
            }
            else if(ctr == 117) {
                bg.setImageResource(R.drawable.fire_bg);
            }
            else if(ctr == 123) {
                bg.setImageResource(R.drawable.black);
                level = 7;
                hp = 3;
                enemyHp = 7;
                holder = 4;
            }
            else if(ctr == 124) {
                bg.setImageResource(R.drawable.water_bg);
            }
            else if(ctr == 127) {
                bg.setImageResource(R.drawable.water);
                bgm = MediaPlayer.create(getApplicationContext(), R.raw.battle_theme7);
                bgm.setLooping(true);
                bgm.start();
            }
            else if(ctr == 144) {
                if (hp > 0 && enemyHp > 0) {
                    start();
                    ctr2 = (1 + shuffle.nextInt(holder) - 1);
                    if (ctr2 == 0) {
                        hint.setText(hint7[ctr2]);
                        btn1.setText(battle71[0]);
                        btn2.setText(battle71[1]);
                        btn3.setText(battle71[2]);
                    } else if (ctr2 == 1) {
                        hint.setText(hint7[ctr2]);
                        btn1.setText(battle72[0]);
                        btn2.setText(battle72[1]);
                        btn3.setText(battle72[2]);
                    } else if (ctr2 == 2) {
                        hint.setText(hint7[ctr2]);
                        btn1.setText(battle73[0]);
                        btn2.setText(battle73[1]);
                        btn3.setText(battle73[2]);
                    } else {
                        hint.setText(hint7[ctr2]);
                        btn1.setText(battle74[0]);
                        btn2.setText(battle74[1]);
                        btn3.setText(battle74[2]);
                    }
                    ctr--;
                } else {
                    if (hp == 0) {
                        dead();
                    } else {
                        bgm.pause();
                    }
                }
            }
            else if(ctr == 149) {
                bg.setImageResource(R.drawable.water_bg);
            }
            else if(ctr == 152) {
                bg.setImageResource(R.drawable.black);
                level = 8;
                hp = 3;
                enemyHp = 8;
                holder = 5;
            }
            else if(ctr == 154) {
                bg.setImageResource(R.drawable.wind);
                bgm = MediaPlayer.create(getApplicationContext(), R.raw.battle_theme8);
                bgm.setLooping(true);
                bgm.start();
            }
            else if(ctr == 163) {
                if (hp > 0 && enemyHp > 0) {
                    start();
                    ctr2 = (1 + shuffle.nextInt(holder) - 1);
                    if (ctr2 == 0) {
                        hint.setText(hint8[ctr2]);
                        btn1.setText(battle81[0]);
                        btn2.setText(battle81[1]);
                        btn3.setText(battle81[2]);
                    } else if (ctr2 == 1) {
                        hint.setText(hint8[ctr2]);
                        btn1.setText(battle82[0]);
                        btn2.setText(battle82[1]);
                        btn3.setText(battle82[2]);
                    } else if (ctr2 == 2) {
                        hint.setText(hint8[ctr2]);
                        btn1.setText(battle83[0]);
                        btn2.setText(battle83[1]);
                        btn3.setText(battle83[2]);
                    } else if (ctr2 == 3) {
                        hint.setText(hint8[ctr2]);
                        btn1.setText(battle84[0]);
                        btn2.setText(battle84[1]);
                        btn3.setText(battle84[2]);
                    } else {
                        hint.setText(hint8[ctr2]);
                        btn1.setText(battle85[0]);
                        btn2.setText(battle85[1]);
                        btn3.setText(battle85[2]);
                    }
                    ctr--;
                } else {
                    if (hp == 0) {
                        dead();
                    } else {
                        bgm.pause();
                    }
                }
            }
            else if(ctr == 171) {
                bg.setImageResource(R.drawable.wind_bg);
            }
            else if(ctr == 172) {
                bg.setImageResource(R.drawable.black);
                level = 9;
                hp = 3;
                enemyHp = 9;
                holder = 5;
            }
            else if(ctr == 176) {
                bg.setImageResource(R.drawable.queen);
                bgm = MediaPlayer.create(getApplicationContext(), R.raw.battle_theme9);
                bgm.setLooping(true);
                bgm.start();
            }
            else if(ctr == 191) {
                if (hp > 0 && enemyHp > 0) {
                    start();
                    ctr2 = (1 + shuffle.nextInt(holder) - 1);
                    if (ctr2 == 0) {
                        hint.setText(hint9[ctr2]);
                        btn1.setText(battle91[0]);
                        btn2.setText(battle91[1]);
                        btn3.setText(battle91[2]);
                    } else if (ctr2 == 1) {
                        hint.setText(hint9[ctr2]);
                        btn1.setText(battle92[0]);
                        btn2.setText(battle92[1]);
                        btn3.setText(battle92[2]);
                    } else if (ctr2 == 2) {
                        hint.setText(hint9[ctr2]);
                        btn1.setText(battle93[0]);
                        btn2.setText(battle93[1]);
                        btn3.setText(battle93[2]);
                    } else if (ctr2 == 3) {
                        hint.setText(hint9[ctr2]);
                        btn1.setText(battle94[0]);
                        btn2.setText(battle94[1]);
                        btn3.setText(battle94[2]);
                    } else {
                        hint.setText(hint9[ctr2]);
                        btn1.setText(battle95[0]);
                        btn2.setText(battle95[1]);
                        btn3.setText(battle95[2]);
                    }
                    ctr--;
                } else {
                    if (hp == 0) {
                        dead();
                    } else {
                        bgm.pause();
                    }
                }
            }
            else if(ctr == 192) {
                bg.setImageResource(R.drawable.queen_bg);
            }
            else if(ctr == 198) {
                bg.setImageResource(R.drawable.black);
                hp = 5;
                enemyHp = 10;
                level = 10;
                holder = 5;
            }
            else if(ctr == 201) {
                bg.setImageResource(R.drawable.king);
                bgm = MediaPlayer.create(getApplicationContext(), R.raw.battle_theme10);
                bgm.setLooping(true);
                bgm.start();
            }
            else if(ctr == 231) {
                if (hp > 0 && enemyHp > 0) {
                    start();
                    ctr2 = (1 + shuffle.nextInt(holder) - 1);
                    if (ctr2 == 0) {
                        bg.setImageResource(R.drawable.pawn);
                        hint.setText(hint10[ctr2]);
                        btn1.setText(battle101[0]);
                        btn2.setText(battle101[1]);
                        btn3.setText(battle101[2]);
                    } else if (ctr2 == 1) {
                        bg.setImageResource(R.drawable.bishop);
                        hint.setText(hint10[ctr2]);
                        btn1.setText(battle102[0]);
                        btn2.setText(battle102[1]);
                        btn3.setText(battle102[2]);
                    } else if (ctr2 == 2) {
                        bg.setImageResource(R.drawable.rook);
                        hint.setText(hint10[ctr2]);
                        btn1.setText(battle103[0]);
                        btn2.setText(battle103[1]);
                        btn3.setText(battle103[2]);
                    } else if (ctr2 == 3) {
                        bg.setImageResource(R.drawable.knight);
                        hint.setText(hint10[ctr2]);
                        btn1.setText(battle104[0]);
                        btn2.setText(battle104[1]);
                        btn3.setText(battle104[2]);
                    } else {
                        bg.setImageResource(R.drawable.queen);
                        hint.setText(hint10[ctr2]);
                        btn1.setText(battle105[0]);
                        btn2.setText(battle105[1]);
                        btn3.setText(battle105[2]);
                    }
                    ctr--;
                } else {
                    if (hp == 0) {
                        dead();
                    } else {
                        bg.setImageResource(R.drawable.king);
                        bgm.pause();
                    }
                }
            }
            else if(ctr == 238) {
                bg.setImageResource(R.drawable.king_bg);
            }
            else if(ctr == 239) {
                bg.setImageResource(R.drawable.black);
            }
            else if(ctr == 240) {
                bg.setImageResource(R.drawable.black);
                level = 11;
            }
            else if(ctr == 243) {
                bg.setImageResource(R.drawable.princess);
                bgm = MediaPlayer.create(getApplicationContext(), R.raw.main_theme);
                bgm.setLooping(true);
                bgm.start();
            }
            else if(ctr == 255) {
                bg.setImageResource(R.drawable.black);
            }
            else if(ctr == 262) {
                AudioManager sound = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
                sound.setStreamMute(AudioManager.STREAM_MUSIC, false);
                bgm.stop();
                bgm.release();
                checker = false;
                click.start();
                Intent mainMenu = new Intent(this, MainActivity.class);
                startActivity(mainMenu);
                finish();
            }
        }
        else {
            dead();
        }
    }

    //Choice #1
    public void click1(View v) {
        out();
        click.start();
        if(level == 1) {
            if(ctr2 == 0) {
                btn.setText("You: Oww! He's way faster than me!");
                playerDamage();
            }
            else {
                btn.setText("You: ...Really? Now his hit point just increased.");
                enemyHeal();
            }
        }
        else if(level == 2) {
            if(ctr2 == 0) {
                btn.setText("Bishop: MOVE to the SIDES, you little piece of--!");
                zap.start();
            }
            else {
                btn.setText("You: ...Right. He just recovered his health plus his magic again.");
                enemyHeal();
            }
        }
        else if(level == 3) {
            if(ctr2 == 0) {
                btn.setText("You: Oh no. Ohnohnohnohnohno I'll land on the spikes-- Gyaaaah!!!");
                playerDamage();
                jump.start();
            }
            else if(ctr2 == 1) {
                btn.setText("Daichi: Argh! So you aren't stupid after all!");
            }
            else {
                btn.setText("You: ...I just wasted 30 minutes and it seems like Daichi looks better than earlier.");
                enemyHeal();
                crumble.start();
            }
        }
        else if(level == 4) {
            if(ctr2 == 0) {
                btn.setText("Rook: Well done!");
            }
            else if(ctr2 == 1) {
                btn.setText("Rook: I told you my smash was unstoppable!");
                playerDamage();
            }
            else {
                btn.setText("You: Oh, baby! I love this shield now!");
                clash();
            }
        }
        else if(level == 5) {
            if(ctr2 == 0) {
                btn.setText("Knight: ...");
                playerHit();
            }
            else if(ctr2 == 1) {
                btn.setText("You: Urgh!");
                playerDamage();
            }
            else {
                btn.setText("*clash*");
                clash();
            }
        }
        else if(level == 6) {
            if(ctr2 == 0) {
                btn.setText("You: Gaahh!");
                playerDamage();
            }
            else if(ctr2 == 1) {
                btn.setText("Honoo: You got me.");
                playerHit();
            }
            else {
                btn.setText("You: ...Same.");
                clash();
            }
        }
        else if(level == 7) {
            if(ctr2 == 0) {
                btn.setText("You: The spikes only passed through the dragon's body!");
                playerDamage();
            }
            else if(ctr2 == 1) {
                btn.setText("You: Ooof!");
                playerDamage();
            }
            else if(ctr2 == 2) {
                btn.setText("You: Sweet! The water quickly turned into steam! The heat also affected Mizu! Just how hot is this sword!?");
                playerHit();
            }
            else {
                btn.setText("You: There's just too many!");
                playerDamage();
            }
        }
        else if(level == 8) {
            if(ctr2 == 0) {
                btn.setText("You: I didn't missed!");
                playerHit();
            }
            else if(ctr2 == 1) {
                btn.setText("You: His powers aren't really a big help right now...!");
                playerDamage();
            }
            else if(ctr2 == 2) {
                btn.setText("You: Ah, well. At least I got a little bit of health in a time of crisis...");
                hp++;
                heal.start();
            }
            else if(ctr2 == 3) {
                btn.setText("You: The leaves just sliced through his shield like it's butter!");
                playerDamage();
            }
            else if(ctr2 == 4) {
                btn.setText("Kaze: Wait, wha--!? I-- I'm slipping!... No... No, wait. Not the wall! Not the wal--! *BLAM!*");
                playerHit();
            }
        }
        else if(level == 9) {
            if(ctr2 == 0) {
                btn.setText("You: It's not enough to shield me from dozens of meteors!");
                playerDamage();
            }
            else if(ctr2 == 1) {
                btn.setText("You: There you are, Queen!");
                clash();
            }
            else if(ctr2 == 2) {
                btn.setText("You: Argh! It's not enough to melt the ice!");
                playerDamage();
            }
            else if(ctr2 == 3) {
                btn.setText("You: Sweet! I got through the Firewall!");
                clash();
            }
            else if(ctr2 == 4) {
                btn.setText("You: This is still a win-win situation...");
                hp += 2;
                enemyHeal();
                enemyHeal();
            }
        }
        else if(level == 10) {
            if(ctr2 == 0) {
                btn.setText("You: Oww! He's way faster than me!");
                playerDamage();
            }
            else if(ctr2 == 1) {
                btn.setText("Bishop: MOVE to the SIDES, you little piece of--!");
            }
            else if(ctr2 == 2) {
                btn.setText("You: Oh, baby! I love this shield now!");
                clash();
            }
            else if(ctr2 == 3) {
                btn.setText("You: Urgh!");
                playerDamage();
            }
            else if(ctr2 == 4) {
                btn.setText("You: This is still a win-win situation...");
                hp++;
                enemyHeal();
            }
        }
    }

    //Choice #2
    public void click2(View v) {
        out();
        click.start();
        if(level == 1) {
            if(ctr2 == 0) {
                btn.setText("Pawn: A wise decision.");
                clash();
            }
            else {
                btn.setText("Pawn: Arrrgghh!");
                playerHit();
            }
        }
        else if(level == 2) {
            if(ctr2 == 0) {
                btn.setText("You: Oww! The lightning is on BOTH sides! I shouldn't go there!");
                playerDamage();
            }
            else {
                btn.setText("You: Okay... Slowly... Well, schmuck. He finished recovering before I can even get to him.");
                enemyHeal();
            }
        }
        else if(level == 3) {
            if(ctr2 == 0) {
                btn.setText("Daichi: Grrr!");
                playerHit();
            }
            else if(ctr2 == 1) {
                btn.setText("Daichi: Hahaha! Are you really that stupid!?");
                playerDamage();
            }
            else {
                btn.setText("You: ...I tried to break the shield, but my sword broke instead. I'm screwed.");
                clash();
                instantDeath = true;
            }
        }
        else if(level == 4) {
            if(ctr2 == 0) {
                btn.setText("Rook: Well done!");
            }
            else if(ctr2 == 1) {
                btn.setText("You: Alright! It stopped Rook's unstoppable smash!");
                playerHit();
            }
            else {
                btn.setText("You: I can't dodge this!!!");
                playerDamage();
                playerDamage();
            }
        }
        else if(level == 5) {
            if(ctr2 == 0) {
                btn.setText("*clash*");
                clash();
            }
            else if(ctr2 == 1) {
                btn.setText("Knight: ...");
                playerHit();
            }
            else {
                btn.setText("You: Urgh!");
                playerDamage();
            }
        }
        else if(level == 6) {
            if(ctr2 == 0) {
                btn.setText("You: Oh, look. It's the same as his.");
                clash();
            }
            else if(ctr2 == 1) {
                btn.setText("You: I'm wrong!");
                playerDamage();
            }
            else {
                btn.setText("You: Alright! I'm acing this!");
                playerHit();
            }
        }
        else if(level == 7) {
            if(ctr2 == 0) {
                btn.setText("You: It's no use against a huge tsunami!");
                playerDamage();
            }
            else if(ctr2 == 1) {
                btn.setText("You: I don't know how but I did it!");
                jump.start();
            }
            else if(ctr2 == 2) {
                btn.setText("Mizu: This water is sacred. It gives me great recovery.");
                enemyHeal();
                enemyHeal();
                enemyHeal();
            }
            else {
                btn.setText("You: Did you really think that I can-- Ack!!!");
                playerDamage();
            }
        }
        else if(level == 8) {
            if(ctr2 == 0) {
                btn.setText("Kaze: You missed.");
                playerDamage();
            }
            else if(ctr2 == 1) {
                btn.setText("You: Her Water Dragon is useless!... Oops. I shouldn't say that out loud. It would be bad if Mizu reincarnated just to \n" +
                        "give me a good walloping.");
                playerDamage();
            }
            else if(ctr2 == 2) {
                btn.setText("You: The flame got easily blown away like a teeny-tiny fire on a candlestick...");
                playerDamage();
            }
            else if(ctr2 == 3) {
                btn.setText("You: He burned all those killer leaves! Nice!");
                playerHit();
            }
            else if(ctr2 == 4) {
                btn.setText("You: Nope. No effect against his super speed.");
                playerDamage();
            }
        }
        else if(level == 9) {
            if(ctr2 == 0) {
                btn.setText("Queen: Splendid.");
                playerHit();
                playerHit();
            }
            else if(ctr2 == 1) {
                btn.setText("You: Yeowch! I forgot this shield is prone to being cheated!");
                playerDamage();
            }
            else if(ctr2 == 2) {
                btn.setText("You: Alright! Fire may be weak to Water, but it sure is strong against Ice!");
                playerHit();
                playerHit();
            }
            else if(ctr2 == 3) {
                btn.setText("You: The cannonballs just got melted up!");
                playerDamage();
            }
            else if(ctr2 == 4) {
                btn.setText("You: Scratch that. This was a bad idea-- Oww!!!.");
                playerDamage();
                enemyHeal();
                enemyHeal();
            }
        }
        else if(level == 10) {
            if(ctr2 == 0) {
                btn.setText("Pawn: A wise decision.");
                clash();
            }
            else if(ctr2 == 1) {
                btn.setText("You: Oww! The lightning is on BOTH sides! I shouldn't go there!");
                playerDamage();
            }
            else if(ctr2 == 2) {
                btn.setText("You: I can't dodge this!!!");
                playerDamage();
                playerDamage();
            }
            else if(ctr2 == 3) {
                btn.setText("Knight: ...");
                playerHit();
                playerHit();
                playerHit();
            }
            else if(ctr2 == 4) {
                btn.setText("You: Scratch that. This was a bad idea-- Oww!!!.");
                playerDamage();
                enemyHeal();
            }
        }
    }

    //Choice #3
    public void click3(View v) {
        out();
        click.start();
        if(level == 1) {
            if(ctr2 == 0) {
                btn.setText("You: ...Now why the hell did I wait for him to strike-- Oww!!!");
                playerDamage();
            }
            else {
                btn.setText("You: It won't budge! Hey, who locked the door!?");
                enemyHeal();
            }
        }
        else if(level == 2) {
            if(ctr2 == 0) {
                btn.setText("You: Oww! The lightning is on BOTH sides! I shouldn't go there!");
                playerDamage();
            }
            else {
                btn.setText("You: Here goes! Haaah!!!");
                playerHit();
            }
        }
        else if(level == 3) {
            if(ctr2 == 0) {
                btn.setText("You: Oh my-- The spikes are everywhere! Arrggh!!!");
                playerDamage();
            }
            else if(ctr2 == 1) {
                btn.setText("You: ...On second thought, it can. Oww!!!");
                playerDamage();
            }
            else {
                btn.setText("Daichi: What the-- That is cheating! Graaagh!!!");
                playerHit();
            }
        }
        else if(level == 4) {
            if(ctr2 == 0) {
                btn.setText("You: Gaahh! He's tougher than he looks!");
                playerDamage();
            }
            else if(ctr2 == 1) {
                btn.setText("You: Grrr! I can't dodge fast enough!");
                playerDamage();
            }
            else {
                btn.setText("Rook: I see. Well, see you in the afterlife.");
                instantDeath = true;
            }
        }
        else if(level == 5) {
            if(ctr2 == 0) {
                btn.setText("You: Urgh!");
                playerDamage();
            }
            else if(ctr2 == 1) {
                btn.setText("*clash*");
                clash();
            }
            else {
                btn.setText("Knight: ...");
                playerHit();
            }
        }
        else if(level == 6) {
            if(ctr2 == 0) {
                btn.setText("Honoo: Aw, shucks.");
                playerHit();
            }
            else if(ctr2 == 1) {
                btn.setText("Honoo: Well, would you look at that? We got the same. Hehe.");
                clash();
            }
            else {
                btn.setText("Honoo: Too bad.");
                playerDamage();
            }
        }
        else if(level == 7) {
            if(ctr2 == 0) {
                btn.setText("You: Wow! I didn't know surfing would be this great!");
                splash.start();
            }
            else if(ctr2 == 1) {
                btn.setText("Maybe this combination's not a good idea...");
                playerDamage();
            }
            else if(ctr2 == 2) {
                btn.setText("You: I...! Can't...! This water seems like it's pushing me away!");
                enemyHeal();
                enemyHeal();
                enemyHeal();
                hp += 3;
            }
            else {
                btn.setText("You: I still love this shield. Mwaah~");
            }
        }
        else if(level == 8) {
            if(ctr2 == 0) {
                btn.setText("Kaze: Where are you aiming at?");
                playerDamage();
            }
            else if(ctr2 == 1) {
                btn.setText("You: Daichi, you're da man! What with your shield and all~");
            }
            else if(ctr2 == 2) {
                btn.setText("You: Ahh... Nice and comfy...");
                clash();
            }
            else if(ctr2 == 3) {
                btn.setText("You: Her Ice Shield turned into Ice Cubes!");
                playerDamage();
            }
            else if(ctr2 == 4) {
                btn.setText("You: Nope. Still blown away by the wind.");
                playerDamage();
            }
        }
        else if(level == 9) {
            if(ctr2 == 0) {
                btn.setText("Queen: Hahaha! As if you can cut through huge chunks of rocks with THAT!");
                playerDamage();
            }
            else if(ctr2 == 1) {
                btn.setText("Queen: Hmph. Constructed your own defense, I see.");
                clash();
            }
            else if(ctr2 == 2) {
                btn.setText("You: The rocks can't even make a dent on it!");
                playerDamage();
            }
            else if(ctr2 == 3) {
                btn.setText("You: Floating sands can't get me through the Firewall!");
                playerDamage();
            }
            else if(ctr2 == 4) {
                btn.setText("You: Well, it's better to be safe than sorry.");
                enemyHeal();
                enemyHeal();
            }
        }
        else if(level == 10) {
            if(ctr2 == 0) {
                btn.setText("You: ...Now why the hell did I wait for him to strike-- Oww!!!");
                playerDamage();
            }
            else if(ctr2 == 1) {
                btn.setText("You: Oww! The lightning is on BOTH sides! I shouldn't go there!");
                playerDamage();
            }
            else if(ctr2 == 2) {
                btn.setText("Rook: I see. Well, see you in the afterlife.");
                instantDeath = true;
            }
            else if(ctr2 == 3) {
                btn.setText("*clash*");
                clash();
            }
            else if(ctr2 == 4) {
                btn.setText("You: Well, it's better to be safe than sorry.");
                enemyHeal();
            }
        }
    }

    //activates once battle mode is out
    public void out() {
        btn.setVisibility(View.VISIBLE);
        you.setVisibility(View.GONE);
        enemy.setVisibility(View.GONE);
        hint.setVisibility(View.GONE);
        btn1.setVisibility(View.GONE);
        btn2.setVisibility(View.GONE);
        btn3.setVisibility(View.GONE);
    }

    //activates once a battle starts
    public void start() {
        btn.setVisibility(View.GONE);
        you.setVisibility(View.VISIBLE);
        enemy.setVisibility(View.VISIBLE);
        hint.setVisibility(View.VISIBLE);
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        you.setText("HP: " + hp);
        enemy.setText("HP: " + enemyHp);
    }

    //Retry confirmation
    public void retry(View v) {
        click.start();
        bg.setImageResource(R.drawable.black);
        back.setVisibility(View.VISIBLE);
        sounds.setVisibility(View.VISIBLE);
        btn.setText(" ");
        btn.setVisibility(View.VISIBLE);
        confirm.setVisibility(View.GONE);
        yes.setVisibility(View.GONE);
        no.setVisibility(View.GONE);
        instantDeath = false;
        bgm.pause();
            if (level == 1) {
                ctr = 0;
            } else if (level == 2) {
                ctr = 17;
            } else if (level == 3) {
                ctr = 29;
            } else if (level == 4) {
                ctr = 45;
            } else if (level == 5) {
                ctr = 60;
            } else if (level == 6) {
                ctr = 76;
            } else if (level == 7) {
                ctr = 122;
            } else if (level == 8) {
                ctr = 151;
            } else if (level == 9) {
                ctr = 170;
            } else if (level == 10) {
                ctr = 197;
        }
    }

    //Activates when player dies
    public void dead() {
        back.setVisibility(View.GONE);
        sounds.setVisibility(View.GONE);
        btn.setVisibility(View.GONE);
        confirm.setVisibility(View.VISIBLE);
        yes.setVisibility(View.VISIBLE);
        no.setVisibility(View.VISIBLE);
    }

    //Responsible for muting the audio in-game
    public void mute(View v) {
        click.start();
        if(soundChecker) {
            sounds.setBackgroundResource(R.drawable.offsound);
            AudioManager sound = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
            sound.setStreamMute(AudioManager.STREAM_MUSIC, true);
            soundChecker = false;
        }
        else {
            sounds.setBackgroundResource(R.drawable.onsound);
            AudioManager sound = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
            sound.setStreamMute(AudioManager.STREAM_MUSIC, false);
            soundChecker = true;
        }
    }

    //Redirects user to Main Menu
    public void mainMenu(View v) {
        AudioManager sound = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        sound.setStreamMute(AudioManager.STREAM_MUSIC, false);
        bgm.stop();
        bgm.release();
        checker = false;
        click.start();
        Intent mainMenu = new Intent(this, MainActivity.class);
        startActivity(mainMenu);
        finish();
    }

    //Activates when player hits the enemy
    public void playerHit() {
        hit.start();
        enemyHp--;
    }

    //Activates when player is damaged
    public void playerDamage() {
        dmg.start();
        hp--;
        Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        bg.startAnimation(shake);
    }

    //Activates when enemy heals
    public void enemyHeal() {
        heal.start();
        enemyHp++;
    }

    //Activates when player successfully defends
    public void clash() {
        swordClash.start();
    }

    //Used for debugging and skipping levels
    public void skip(View v) {
        click.start();
        checker=true;
        bgm.pause();
        if(ctr < 17) {
            skip.setText("2");
            ctr = 17;
        }
        else if(ctr < 29) {
            skip.setText("3");
            ctr = 29;
        }
        else if(ctr < 45) {
            skip.setText("4");
            ctr = 45;
        }
        else if(ctr < 60) {
            skip.setText("5");
            ctr = 60;
        }
        else if(ctr < 76) {
            skip.setText("6");
            ctr = 76;
        }
        else if(ctr < 122) {
            skip.setText("7");
            ctr = 122;
        }
        else if(ctr < 151) {
            skip.setText("8");
            ctr = 151;
        }
        else if(ctr < 170) {
            skip.setText("9");
            ctr = 170;
        }
        else if(ctr < 197) {
            skip.setText("10");
            ctr = 197;
        }
        else if(ctr < 239) {
            skip.setText("11");
            ctr = 239;
        }
    }
}
