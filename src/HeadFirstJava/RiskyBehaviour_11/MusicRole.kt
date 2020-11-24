package HeadFirstJava.RiskyBehaviour_11

import javax.sound.midi.MidiSystem
import javax.sound.midi.MidiUnavailableException

internal class MusicRole {
    fun play() {
        try {
            val sequencer = MidiSystem.getSequencer()
            println(sequencer)
        } catch (e: MidiUnavailableException) {
            e.printStackTrace()
        }
    }
}