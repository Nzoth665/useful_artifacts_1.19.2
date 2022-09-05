package net.nzot.usefulatifactsmod.world.structure.structures;

import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;

import java.util.Optional;

public class MiniDepositsAmethystsStructures extends Structure {
    protected MiniDepositsAmethystsStructures(StructureSettings p_226558_) {
        super(p_226558_);
    }

    @Override
    public Optional<GenerationStub> findGenerationPoint(GenerationContext p_226571_) {
        return Optional.empty();
    }

    @Override
    public StructureType<?> type() {
        return null;
    }
}
