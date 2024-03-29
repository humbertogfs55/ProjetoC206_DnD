/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Model;

/**
 *
 * @author burns
 */
public class Monstro extends Actor {

    private String cLass;
    private String speed;
    private String level;
    private String ac;
    private String proficiency;
    private String spellDc;
    private String spellatk;
    private String spells;
    private String notas;

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getInitiative() {
        return initiative;
    }

    public void setInitiative(String initiative) {
        this.initiative = initiative;
    }

    public String showMonstro() {
        String aux = "Monstro: " + nome + "\n"
                + "Raça: " + race + "\n"
                + "Level: " + level + "\n"
                + "Total HP: " + hp + "\n"
                + "Classe de armadura: " + ac + "\n"
                + "Movimento: " + speed + "\n"
                + "Iniciativa: " + initiative + "\n";
        return aux;
    }

    public String getSpellDc() {
        return spellDc;
    }

    public void setSpellDc(String spellDc) {
        this.spellDc = spellDc;
    }

    public String getSpellatk() {
        return spellatk;
    }

    public void setSpellatk(String spellatk) {
        this.spellatk = spellatk;
    }

    public String getSpells() {
        return spells;
    }

    public void setSpells(String spells) {
        this.spells = spells;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    private Atribute str = new Atribute();
    private Atribute dex = new Atribute();
    private Atribute con = new Atribute();
    private Atribute iNt = new Atribute();
    private Atribute wis = new Atribute();
    private Atribute cha = new Atribute();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcLass() {
        return cLass;
    }

    public void setcLass(String cLass) {
        this.cLass = cLass;
    }

    public Atribute getStr() {
        return str;
    }

    public void setStr(Atribute str) {
        this.str = str;
    }

    public Atribute getDex() {
        return dex;
    }

    public void setDex(Atribute dex) {
        this.dex = dex;
    }

    public Atribute getCon() {
        return con;
    }

    public void setCon(Atribute con) {
        this.con = con;
    }

    public Atribute getiNt() {
        return iNt;
    }

    public void setiNt(Atribute iNt) {
        this.iNt = iNt;
    }

    public Atribute getWis() {
        return wis;
    }

    public void setWis(Atribute wis) {
        this.wis = wis;
    }

    public Atribute getCha() {
        return cha;
    }

    public void setCha(Atribute cha) {
        this.cha = cha;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getBackGround() {
        return backGround;
    }

    public void setBackGround(String backGround) {
        this.backGround = backGround;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    @Override
    public int compareTo(Actor o) {
        if (Integer.parseInt(this.initiative) == Integer.parseInt(o.initiative)) {
            return 0;
        } else if (Integer.parseInt(this.initiative) > Integer.parseInt(o.initiative)) {
            return -1;
        } else {
            return 1;
        }
    }

}
