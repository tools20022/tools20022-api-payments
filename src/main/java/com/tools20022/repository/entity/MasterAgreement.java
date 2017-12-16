/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.AgreementFrameworkCode;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Agreement which defines the framework of a contract between two trading
 * parties in different domains such as collateral, derivatives, trade..
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MasterAgreement" src="doc-files/MasterAgreement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Agreement
 * Agreement}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmCollateralAgreement
 * MasterAgreement.mmCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmMasterAgreementType
 * MasterAgreement.mmMasterAgreementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmGovernedTrades
 * MasterAgreement.mmGovernedTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmGovernedContract
 * MasterAgreement.mmGovernedContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmGoverningLaw
 * MasterAgreement.mmGoverningLaw}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmGoverningDocument
 * Trade.mmGoverningDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Contract#mmMasterAgreement
 * Contract.mmMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmAssociatedMasterAgreement
 * CollateralAgreement.mmAssociatedMasterAgreement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MasterAgreement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement which defines the framework of a contract between two trading parties in different domains such as collateral, derivatives, trade.."
 * </li>
 * </ul>
 */
public class MasterAgreement extends Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CollateralAgreement collateralAgreement;
	/**
	 * Collateral agreement which is governed by the related master agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmAssociatedMasterAgreement
	 * CollateralAgreement.mmAssociatedMasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral agreement which is governed by the related master agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCollateralAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MasterAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAgreement";
			definition = "Collateral agreement which is governed by the related master agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmAssociatedMasterAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
		}
	};
	protected AgreementFrameworkCode masterAgreementType;
	/**
	 * Nature of the agreement, eg, ISDA Master Agreement or bilateral
	 * agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementFrameworkCode
	 * AgreementFrameworkCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterAgreementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Nature of the agreement, eg, ISDA Master Agreement or bilateral agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMasterAgreementType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MasterAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MasterAgreementType";
			definition = "Nature of the agreement, eg, ISDA Master Agreement or bilateral agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AgreementFrameworkCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MasterAgreement.class.getMethod("getMasterAgreementType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Trade> governedTrades;
	/**
	 * Trades to which the master agreement applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmGoverningDocument
	 * Trade.mmGoverningDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernedTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trades to which the master agreement applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGovernedTrades = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MasterAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GovernedTrades";
			definition = "Trades to which the master agreement applies.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmGoverningDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected Contract governedContract;
	/**
	 * Contract which is governed by the master agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Contract#mmMasterAgreement
	 * Contract.mmMasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernedContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract which is governed by the master agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGovernedContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MasterAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GovernedContract";
			definition = "Contract which is governed by the master agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Contract.mmMasterAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Contract.mmObject();
		}
	};
	protected CountryCode governingLaw;
	/**
	 * National law under which a non-deliverable contract has been agreed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoverningLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "National law under which a non-deliverable contract has been agreed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmGoverningLaw = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MasterAgreement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GoverningLaw";
			definition = "National law under which a non-deliverable contract has been agreed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MasterAgreement.class.getMethod("getGoverningLaw", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MasterAgreement";
				definition = "Agreement which defines the framework of a contract between two trading parties in different domains such as collateral, derivatives, trade..";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmGoverningDocument, com.tools20022.repository.entity.Contract.mmMasterAgreement,
						com.tools20022.repository.entity.CollateralAgreement.mmAssociatedMasterAgreement);
				superType_lazy = () -> Agreement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MasterAgreement.mmCollateralAgreement, com.tools20022.repository.entity.MasterAgreement.mmMasterAgreementType,
						com.tools20022.repository.entity.MasterAgreement.mmGovernedTrades, com.tools20022.repository.entity.MasterAgreement.mmGovernedContract, com.tools20022.repository.entity.MasterAgreement.mmGoverningLaw);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MasterAgreement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CollateralAgreement getCollateralAgreement() {
		return collateralAgreement;
	}

	public void setCollateralAgreement(com.tools20022.repository.entity.CollateralAgreement collateralAgreement) {
		this.collateralAgreement = collateralAgreement;
	}

	public AgreementFrameworkCode getMasterAgreementType() {
		return masterAgreementType;
	}

	public void setMasterAgreementType(AgreementFrameworkCode masterAgreementType) {
		this.masterAgreementType = masterAgreementType;
	}

	public List<Trade> getGovernedTrades() {
		return governedTrades;
	}

	public void setGovernedTrades(List<com.tools20022.repository.entity.Trade> governedTrades) {
		this.governedTrades = governedTrades;
	}

	public Contract getGovernedContract() {
		return governedContract;
	}

	public void setGovernedContract(com.tools20022.repository.entity.Contract governedContract) {
		this.governedContract = governedContract;
	}

	public CountryCode getGoverningLaw() {
		return governingLaw;
	}

	public void setGoverningLaw(CountryCode governingLaw) {
		this.governingLaw = governingLaw;
	}
}