package com.hfad.dnd_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hfad.dnd_list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recalculation()

        with(binding){
            strengthPlus.setOnClickListener {
                binding.modStrength.text = plus(binding.modStrength.text.toString()).toString()
                recalculation(s = binding.modStrength.text.toString())
            }
            strengthMinus.setOnClickListener {
                binding.modStrength.text = minus(binding.modStrength.text.toString()).toString()
                recalculation(s = binding.modStrength.text.toString())
            }
            dexterityPlus.setOnClickListener {
                binding.modDexterity.text = plus(binding.modDexterity.text.toString()).toString()
                recalculation(l = binding.modDexterity.text.toString())
            }
            dexterityMinus.setOnClickListener {
                binding.modDexterity.text = minus(binding.modDexterity.text.toString()).toString()
                recalculation(l = binding.modDexterity.text.toString())
            }
            constitutionPlus.setOnClickListener {
                binding.modConstitution.text = plus(binding.modConstitution.text.toString()).toString()
                recalculation(t = binding.modConstitution.text.toString())
            }
            constitutionMinus.setOnClickListener {
                binding.modConstitution.text = minus(binding.modConstitution.text.toString()).toString()
                recalculation(t = binding.modConstitution.text.toString())
            }
            intelligencePlus.setOnClickListener {
                binding.modIntelligence.text = plus(binding.modIntelligence.text.toString()).toString()
                recalculation(i = binding.modIntelligence.text.toString())
            }
            intelligenceMinus.setOnClickListener {
                binding.modIntelligence.text = minus(binding.modIntelligence.text.toString()).toString()
                recalculation(i = binding.modIntelligence.text.toString())
            }
            wisdomPlus.setOnClickListener {
                binding.modWisdom.text = plus(binding.modWisdom.text.toString()).toString()
                recalculation(m = binding.modWisdom.text.toString())
            }
            wisdomMinus.setOnClickListener {
                binding.modWisdom.text = minus(binding.modWisdom.text.toString()).toString()
                recalculation(m = binding.modWisdom.text.toString())
            }
            charismaPlus.setOnClickListener {
                binding.modCharisma.text = plus(binding.modCharisma.text.toString()).toString()
                recalculation(ch = binding.modCharisma.text.toString())
            }
            charismaMinus.setOnClickListener {
                binding.modCharisma.text = minus(binding.modCharisma.text.toString()).toString()
                recalculation(ch = binding.modCharisma.text.toString())
            }
            saveStrength.setOnClickListener {
                binding.saveStrength.text = valueSave(binding.saveStrength.text.toString())
                recalculation()
            }
            saveDexterity.setOnClickListener {
                binding.saveDexterity.text = valueSave(binding.saveDexterity.text.toString())
                recalculation()
            }
            saveConstitution.setOnClickListener {
                binding.saveConstitution.text = valueSave(binding.saveConstitution.text.toString())
                recalculation()
            }
            saveIntelligence.setOnClickListener {
                binding.saveIntelligence.text = valueSave(binding.saveIntelligence.text.toString())
                recalculation()
            }
            saveWisdom.setOnClickListener {
                binding.saveWisdom.text = valueSave(binding.saveWisdom.text.toString())
                recalculation()
            }
            saveCharisma.setOnClickListener {
                binding.saveCharisma.text = valueSave(binding.saveCharisma.text.toString())
                recalculation()
            }
            valueAthletics.setOnClickListener {
                binding.valueAthletics.text = valueSkill(binding.valueAthletics.text.toString())
                recalculation()
            }
            valueAcrobatics.setOnClickListener {
                binding.valueAcrobatics.text = valueSkill(binding.valueAcrobatics.text.toString())
                recalculation()
            }
            valueSleightOfHand.setOnClickListener {
                binding.valueSleightOfHand.text = valueSkill(binding.valueSleightOfHand.text.toString())
                recalculation()
            }
            valueStealth.setOnClickListener {
                binding.valueStealth.text = valueSkill(binding.valueStealth.text.toString())
                recalculation()
            }
            valueHistory.setOnClickListener {
                binding.valueHistory.text = valueSkill(binding.valueHistory.text.toString())
                recalculation()
            }
            valueArcana.setOnClickListener {
                binding.valueArcana.text = valueSkill(binding.valueArcana.text.toString())
                recalculation()
            }
            valueNature.setOnClickListener {
                binding.valueNature.text = valueSkill(binding.valueNature.text.toString())
                recalculation()
            }
            valueReligion.setOnClickListener {
                binding.valueReligion.text = valueSkill(binding.valueReligion.text.toString())
                recalculation()
            }
            valueInvestigation.setOnClickListener {
                binding.valueInvestigation.text = valueSkill(binding.valueInvestigation.text.toString())
                recalculation()
            }
            valueAnimal.setOnClickListener {
                binding.valueAnimal.text = valueSkill(binding.valueAnimal.text.toString())
                recalculation()
            }
            valueInsight.setOnClickListener {
                binding.valueInsight.text = valueSkill(binding.valueInsight.text.toString())
                recalculation()
            }
            valueMedicine.setOnClickListener {
                binding.valueMedicine.text = valueSkill(binding.valueMedicine.text.toString())
                recalculation()
            }
            valuePerception.setOnClickListener {
                binding.valuePerception.text = valueSkill(binding.valuePerception.text.toString())
                recalculation()
            }
            valueSurvival.setOnClickListener {
                binding.valueSurvival.text = valueSkill(binding.valueSurvival.text.toString())
                recalculation()
            }
            valuePerformance.setOnClickListener {
                binding.valuePerformance.text = valueSkill(binding.valuePerformance.text.toString())
                recalculation()
            }
            valueIntimidation.setOnClickListener {
                binding.valueIntimidation.text = valueSkill(binding.valueIntimidation.text.toString())
                recalculation()
            }
            valueConviction.setOnClickListener {
                binding.valueConviction.text = valueSkill(binding.valueConviction.text.toString())
                recalculation()
            }
            valueDeception.setOnClickListener {
                binding.valueDeception.text = valueSkill(binding.valueDeception.text.toString())
                recalculation()
            }
        }

    }
    private fun recalculation(zn: Array<String> = arrayOf("-5", "-4", "-3", "-2", "-1", "+0", "+1", "+2", "+3", "+4", "+5"),
                              s: String = binding.modStrength.text.toString(),
                              l: String = binding.modDexterity.text.toString(),
                              t: String = binding.modConstitution.text.toString(),
                              i: String = binding.modIntelligence.text.toString(),
                              m: String = binding.modWisdom.text.toString(),
                              ch:String = binding.modCharisma.text.toString(),) {

        val z = arrayOf(s.toInt(), l.toInt(), t.toInt(), i.toInt(), m.toInt(), ch.toInt())
        val auxiliary = Array(10) { "" }
        var a = 0
        for (item in z) {
            if (item in -100..1) auxiliary[a] = zn[0]
            if (item in 2..3) auxiliary[a] = zn[1]
            if (item in 4..5) auxiliary[a] = zn[2]
            if (item in 6..7) auxiliary[a] = zn[3]
            if (item in 8..9) auxiliary[a] = zn[4]
            if (item in 10..11) auxiliary[a] = zn[5]
            if (item in 12..13) auxiliary[a] = zn[6]
            if (item in 14..15) auxiliary[a] = zn[7]
            if (item in 16..17) auxiliary[a] = zn[8]
            if (item in 18..19) auxiliary[a] = zn[9]
            if (item in 20..100) auxiliary[a] = zn[10]
            a += 1
        }
        binding.modValueStrength.text = auxiliary[0]
        binding.modValueDexterity.text = auxiliary[1]
        binding.modValueConstitution.text = auxiliary[2]
        binding.modValueIntelligence.text = auxiliary[3]
        binding.modValueWisdom.text = auxiliary[4]
        binding.modValueCharisma.text = auxiliary[5]
        save(auxiliary[0], auxiliary[1], auxiliary[2], auxiliary[3], auxiliary[4], auxiliary[5])
        skillStrength(auxiliary[0])
        skillDexterity(auxiliary[1])
        skillIntelligence(auxiliary[3])
        skillWisdom(auxiliary[4])
        skillCharisma(auxiliary[5])
    }
    private fun save(s: String, l: String, t: String, i: String, m: String, ch: String) {
        val check = arrayOf( binding.saveStrength.text.toString(), binding.saveDexterity.text.toString(), binding.saveConstitution.text.toString(),
            binding.saveIntelligence.text.toString(), binding.saveWisdom.text.toString(), binding.saveCharisma.text.toString())
        val meaning = arrayOf(s, l, t, i, m, ch)
        var a = 0
        for (item in meaning) {
            if  (check[a] == "save") meaning[a] = (meaning[a].toInt() + 0).toString()
            if  (check[a] == "save+") meaning[a] = (meaning[a].toInt() + 2).toString()
            if  (check[a] == "save_&") meaning[a] = (meaning[a].toInt() + 4).toString()
            if (meaning[a].toInt() >= 0) meaning[a] = "+"+meaning[a]
            a += 1
        }
        binding.saveValueStrength.text = meaning[0]
        binding.saveValueDexterity.text = meaning[1]
        binding.saveValueConstitution.text = meaning[2]
        binding.saveValueIntelligence.text = meaning[3]
        binding.saveValueWisdom.text = meaning[4]
        binding.saveValueCharisma.text = meaning[5]
    }
    private fun valueSave (x:String):String {
        var p = ""
        when (x) {
            "save" -> p = "save+"
            "save+" -> p = "save"
        }
        return p
    }
    private fun valueSkill (x:String):String {
        var p = ""
        when (x) {
            "" -> p = "*"
            "*" -> p = "K"
            "K" -> p = ""
        }
        return p
    }
    fun plus(x: String): Int {
        var plus = x.toInt()
        plus += 1
        return (plus)
    }
    fun minus(x: String): Int {
        var minus = x.toInt()
        minus -= 1
        return (minus)

    }
    private fun skillStrength(s: String) {
        val check = arrayOf(
            binding.valueAthletics.text.toString(),
        )
        var meaning = ""
        var a = 0
        for (item in check) {
            if (check[a] == "") meaning = (s.toInt() + 0).toString()
            if (check[a] == "*") meaning = (s.toInt() + 2).toString()
            if (check[a] == "&") meaning = (s.toInt() + 4).toString()
            if (meaning.toInt() >= 0) meaning = "+$meaning"
            a += 1
        }
        binding.modAthletics.text = meaning
    }
    private fun skillDexterity(s: String) {
        val check = arrayOf(
            binding.valueAcrobatics.text.toString(),
            binding.valueSleightOfHand.text.toString(),
            binding.valueStealth.text.toString()
        )
        val meaning = Array(3) { "" }
        var a = 0
        for (item in check) {
            if (check[a] == "") meaning[a] = (s.toInt() + 0).toString()
            if (check[a] == "*") meaning[a] = (s.toInt() + 2).toString()
            if (check[a] == "&") meaning[a] = (s.toInt() + 4).toString()
            if (meaning[a].toInt() >= 0) meaning[a] = "+" + meaning[a]
            a += 1
        }
        binding.modAcrobatics.text = meaning[0]
        binding.modSleightOfHand.text = meaning[1]
        binding.modStealth.text = meaning[2]
    }
    private fun skillIntelligence(s: String) {
        val check = arrayOf(
            binding.valueArcana.text.toString(),
            binding.valueHistory.text.toString(),
            binding.valueInvestigation.text.toString(),
            binding.valueNature.text.toString(),
            binding.valueReligion.text.toString()
        )
        val meaning = Array(5) { "" }
        var a = 0
        for (item in check) {
            if (check[a] == "") meaning[a] = (s.toInt() + 0).toString()
            if (check[a] == "*") meaning[a] = (s.toInt() + 2).toString()
            if (check[a] == "&") meaning[a] = (s.toInt() + 4).toString()
            if (meaning[a].toInt() >= 0) meaning[a] = "+" + meaning[a]
            a += 1
        }
        binding.modArcana.text = meaning[0]
        binding.modHistory.text = meaning[1]
        binding.modInvestigation.text = meaning[2]
        binding.modNature.text = meaning[3]
        binding.modReligion.text = meaning[4]
    }
    private fun skillWisdom(s: String) {
        val check = arrayOf(
            binding.valueAnimal.text.toString(),
            binding.valueInsight.text.toString(),
            binding.valueMedicine.text.toString(),
            binding.valuePerception.text.toString(),
            binding.valueSurvival.text.toString()
        )
        val meaning = Array(5) { "" }
        var a = 0
        for (item in check) {
            if (check[a] == "") meaning[a] = (s.toInt() + 0).toString()
            if (check[a] == "*") meaning[a] = (s.toInt() + 2).toString()
            if (check[a] == "&") meaning[a] = (s.toInt() + 4).toString()
            if (meaning[a].toInt() >= 0) meaning[a] = "+" + meaning[a]
            a += 1
        }
        binding.modAnimal.text = meaning[0]
        binding.modInsight.text = meaning[1]
        binding.modMedicine.text = meaning[2]
        binding.modPerception.text = meaning[3]
        binding.modSurvival.text = meaning[4]
    }
    private fun skillCharisma(s: String) {
        val check = arrayOf(
            binding.valueConviction.text.toString(),
            binding.valueDeception.text.toString(),
            binding.valueIntimidation.text.toString(),
            binding.valuePerformance.text.toString()
        )
        val meaning = Array(4) { "" }
        var a = 0
        for (item in check) {
            if (check[a] == "") meaning[a] = (s.toInt() + 0).toString()
            if (check[a] == "*") meaning[a] = (s.toInt() + 2).toString()
            if (check[a] == "&") meaning[a] = (s.toInt() + 4).toString()
            if (meaning[a].toInt() >= 0) meaning[a] = "+" + meaning[a]
            a += 1
        }
        binding.modConviction.text = meaning[0]
        binding.modDeception.text = meaning[1]
        binding.modIntimidation.text = meaning[2]
        binding.modPerformance.text = meaning[3]
    }
}