package uk.ac.cam.ch.wwmm.oscarMEMM.memm.data;

import opennlp.maxent.GISModel;
import uk.ac.cam.ch.wwmm.oscar.types.BioType;
import uk.ac.cam.ch.wwmm.oscarMEMM.memm.rescorer.MEMMOutputRescorer;
import uk.ac.cam.ch.wwmm.oscarrecogniser.manualAnnotations.ManualAnnotations;
import uk.ac.cam.ch.wwmm.oscarrecogniser.tokenanalysis.NGramBuilder;

public class MutableMEMMModel extends MEMMModel {

	public MutableMEMMModel() {
		nGram = NGramBuilder.buildOrDeserialiseModel();
	}
	
	public void setRescorer(MEMMOutputRescorer rescorer) {
		super.rescorer = rescorer;
	}

	public void makeEntityTypesAndZeroProbs() {
		super.makeEntityTypesAndZeroProbs();
	}

	public void setUberModel(GISModel trainModel) {
		super.ubermodel = trainModel;
	}
	
	public void putGISModel(BioType prev, GISModel gisModel) {
		super.gmByPrev.put(prev, gisModel);
	}

	public void addTag(BioType prev) {
		super.tagSet.add(prev);
	}

	public void setExtractedTrainingData(ManualAnnotations manualAnnotations) {
		super.manualAnnotations = manualAnnotations;
	}

}
