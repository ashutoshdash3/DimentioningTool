package commons.src.main.java.it.spindox.model.configurations;

/**
 * Created by fabrizio.sanfilippo on 09/05/2017.
 */
public class ClusterConfiguration {

    String sheetLabel;
    Double cpuOverProvisioning;
    Double ramOverProvisioning;
    Double storageReservation;
    //Synergy Changes
    boolean SynSigBladeFlag;
    boolean SynMedBladeFlag;
    boolean SynDataBladeFlag;
    boolean c7KDellStdbladeFlag;
    boolean c7kDellHighPerfBladeFlag;
    
    boolean numaFlag;
    Double maxThroughputPerBladeOverprovisioning;
    Double maxRunningIOPSPerBladeOverprovisioning;
    boolean esxi;
	int esxi_core_blade;
    int esxi_core_socket_0;
    int esxi_core_socket_1;
    int esxi_mem_blade;
    int esxi_mem_socket_0;
    int esxi_mem_socket_1;
    boolean nsx;
    int nsx_core_blade;
    int nsx_core_socket_0;
    int nsx_core_socket_1; 
    int nsx_mem_blade;
    int nsx_mem_socket_0;
    int nsx_mem_socket_1;
    
    

    public ClusterConfiguration() {
    }

    public ClusterConfiguration(String sheetLabel, Double cpuOverProvisioning, Double ramOverProvisioning, Double storageReservation,
    		boolean SynSigBladeFlag,boolean SynMedBladeFlag, boolean SynDataBladeFlag, boolean c7KDellStdbladeFlag, boolean c7kDellHighPerfBladeFlag,
                                boolean numaFlag, Double maxThroughputPerBladeOverprovisioning, Double maxRunningIOPSPerBladeOverprovisioning,
                                boolean esxi, int esxi_core_blade, int esxi_core_socket_0, int esxi_core_socket_1, int esxi_mem_blade, int esxi_mem_socket_0, int esxi_mem_socket_1, boolean nsx, int nsx_core_blade,int nsx_core_socket_0,
                                int nsx_core_socket_1, int nsx_mem_blade, int nsx_mem_socket_0, int nsx_mem_socket_1) {
        this.sheetLabel = sheetLabel;
        this.cpuOverProvisioning = cpuOverProvisioning;
        this.ramOverProvisioning = ramOverProvisioning;
        this.storageReservation = storageReservation;
        
        this.SynSigBladeFlag = SynSigBladeFlag;
        this.SynMedBladeFlag = SynMedBladeFlag;
        this.SynDataBladeFlag = SynDataBladeFlag;
        this.c7KDellStdbladeFlag = c7KDellStdbladeFlag;
        this.c7kDellHighPerfBladeFlag = c7kDellHighPerfBladeFlag;
        
        this.numaFlag = numaFlag;
        this.maxThroughputPerBladeOverprovisioning = maxThroughputPerBladeOverprovisioning;
        this.maxRunningIOPSPerBladeOverprovisioning = maxRunningIOPSPerBladeOverprovisioning;
        this.esxi = esxi;
        this.esxi_core_blade = esxi_core_blade;
        this.esxi_core_socket_0 =esxi_core_socket_0;
        this.esxi_core_socket_1 = esxi_core_socket_1;
        this.esxi_mem_blade = esxi_mem_blade;
        this.esxi_mem_socket_0 = esxi_mem_socket_0;
        this.esxi_mem_socket_1 = esxi_mem_socket_1;
        this.nsx = nsx;
        this.nsx_core_blade = nsx_core_blade;
        this.nsx_core_socket_0 = nsx_core_socket_0;
        this.nsx_core_socket_1 = nsx_core_socket_1;
        this.nsx_mem_blade = nsx_mem_blade;
        this.nsx_mem_socket_0 = nsx_mem_socket_0;
        this.nsx_mem_socket_1  = nsx_mem_socket_1;
    }

    public String getSheetLabel() {
        return sheetLabel;
    }

    public void setSheetLabel(String sheetLabel) {
        this.sheetLabel = sheetLabel;
    }

    public Double getCpuOverProvisioning() {
        return cpuOverProvisioning;
    }

    public void setCpuOverProvisioning(Double cpuOverProvisioning) {
        this.cpuOverProvisioning = cpuOverProvisioning;
    }

    public Double getRamOverProvisioning() {
        return ramOverProvisioning;
    }

    public void setRamOverProvisioning(Double ramOverProvisioning) {
        this.ramOverProvisioning = ramOverProvisioning;
    }

    public Double getStorageReservation() {
        return storageReservation;
    }

    public void setStorageReservation(Double storageReservation) {
        this.storageReservation = storageReservation;
    }

    public boolean isNumaFlag() {
        return numaFlag;
    }

    public void setNumaFlag(boolean numaFlag) {
        this.numaFlag = numaFlag;
    }

    public Double getMaxThroughputPerBladeOverprovisioning() {
        return maxThroughputPerBladeOverprovisioning;
    }

    public void setMaxThroughputPerBladeOverprovisioning(Double maxThroughputPerBladeOverprovisioning) {
        this.maxThroughputPerBladeOverprovisioning = maxThroughputPerBladeOverprovisioning;
    }

    public Double getMaxRunningIOPSPerBladeOverprovisioning() {
        return maxRunningIOPSPerBladeOverprovisioning;
    }

    public void setMaxRunningIOPSPerBladeOverprovisioning(Double maxRunningIOPSPerBladeOverprovisioning) {
        this.maxRunningIOPSPerBladeOverprovisioning = maxRunningIOPSPerBladeOverprovisioning;
    }
    

    public void setStandardConfiguration() {
        sheetLabel = "default_cluster";
        cpuOverProvisioning = 1.0;
        ramOverProvisioning = 1.0;
        storageReservation = 1.0;
        
        SynSigBladeFlag = false;
        SynMedBladeFlag = true;
        SynDataBladeFlag = false;
        c7KDellStdbladeFlag = false;
        c7kDellHighPerfBladeFlag = false;
                
        
        numaFlag = false;
        esxi= false;
		esxi_core_blade= 0;
		esxi_core_socket_0= 0; 
		esxi_core_socket_1= 0;
		esxi_mem_blade= 0;
		esxi_mem_socket_0= 0; 
		esxi_mem_socket_1= 0;
		nsx= false;
		nsx_core_blade= 0;
		nsx_core_socket_0= 0; 
		nsx_core_socket_1=  0;
		nsx_mem_blade= 0;
		nsx_mem_socket_0= 0; 
		nsx_mem_socket_1= 0;
    }

	public boolean isEsxi() {
		return esxi;
	}

	public void setEsxi(boolean esxi) {
		this.esxi = esxi;
	}

	public int getEsxi_core_blade() {
		return esxi_core_blade;
	}

	public void setEsxi_core_blade(int esxi_core_blade) {
		this.esxi_core_blade = esxi_core_blade;
	}

	public int getEsxi_core_socket_0() {
		return esxi_core_socket_0;
	}

	public void setEsxi_core_socket_0(int esxi_core_socket_0) {
		this.esxi_core_socket_0 = esxi_core_socket_0;
	}

	public int getEsxi_core_socket_1() {
		return esxi_core_socket_1;
	}

	public void setEsxi_core_socket_1(int esxi_core_socket_1) {
		this.esxi_core_socket_1 = esxi_core_socket_1;
	}

	public int getEsxi_mem_blade() {
		return esxi_mem_blade;
	}

	public void setEsxi_mem_blade(int esxi_mem_blade) {
		this.esxi_mem_blade = esxi_mem_blade;
	}

	public int getEsxi_mem_socket_0() {
		return esxi_mem_socket_0;
	}

	public void setEsxi_mem_socket_0(int esxi_mem_socket_0) {
		this.esxi_mem_socket_0 = esxi_mem_socket_0;
	}

	public int getEsxi_mem_socket_1() {
		return esxi_mem_socket_1;
	}

	public void setEsxi_mem_socket_1(int esxi_mem_socket_1) {
		this.esxi_mem_socket_1 = esxi_mem_socket_1;
	}

	public boolean isNsx() {
		return nsx;
	}

	public void setNsx(boolean nsx) {
		this.nsx = nsx;
	}

	public int getNsx_core_blade() {
		return nsx_core_blade;
	}

	public void setNsx_core_blade(int nsx_core_blade) {
		this.nsx_core_blade = nsx_core_blade;
	}

	public int getNsx_core_socket_0() {
		return nsx_core_socket_0;
	}

	public void setNsx_core_socket_0(int nsx_core_socket_0) {
		this.nsx_core_socket_0 = nsx_core_socket_0;
	}

	public int getNsx_core_socket_1() {
		return nsx_core_socket_1;
	}

	public void setNsx_core_socket_1(int nsx_core_socket_1) {
		this.nsx_core_socket_1 = nsx_core_socket_1;
	}

	public int getNsx_mem_blade() {
		return nsx_mem_blade;
	}

	public void setNsx_mem_blade(int nsx_mem_blade) {
		this.nsx_mem_blade = nsx_mem_blade;
	}

	public int getNsx_mem_socket_0() {
		return nsx_mem_socket_0;
	}

	public void setNsx_mem_socket_0(int nsx_mem_socket_0) {
		this.nsx_mem_socket_0 = nsx_mem_socket_0;
	}

	public int getNsx_mem_socket_1() {
		return nsx_mem_socket_1;
	}

	public void setNsx_mem_socket_1(int nsx_mem_socket_1) {
		this.nsx_mem_socket_1 = nsx_mem_socket_1;
	}
	public boolean isSynSigBladeFlag() {
		return SynSigBladeFlag;
	}

	public void setSynSigBladeFlag(boolean SynSigBladeFlag) {
		this.SynSigBladeFlag = SynSigBladeFlag;
	}

	public boolean isSynMedBladeFlag() {
		return SynMedBladeFlag;
	}

	public void setSynMedBladeFlag(boolean synMedBladeFlag) {
		SynMedBladeFlag = synMedBladeFlag;
	}

	public boolean isSynDataBladeFlag() {
		return SynDataBladeFlag;
	}

	public void setSynDataBladeFlag(boolean synDataBladeFlag) {
		SynDataBladeFlag = synDataBladeFlag;
	}

	public boolean isC7KDellStdbladeFlag() {
		return c7KDellStdbladeFlag;
	}

	public void setC7KDellStdbladeFlag(boolean c7kDellStdbladeFlag) {
		c7KDellStdbladeFlag = c7kDellStdbladeFlag;
	}

	public boolean isC7kDellHighPerfBladeFlag() {
		return c7kDellHighPerfBladeFlag;
	}

	public void setC7kDellHighPerfBladeFlag(boolean c7kDellHighPerfBladeFlag) {
		this.c7kDellHighPerfBladeFlag = c7kDellHighPerfBladeFlag;
	}


}
