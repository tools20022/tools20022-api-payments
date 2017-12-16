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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Clearing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Process of settling securities through a central system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesClearing" src="doc-files/SecuritiesClearing.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Clearing Clearing}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmSecuritiesSettlement
 * SecuritiesClearing.mmSecuritiesSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmBuyIn
 * SecuritiesClearing.mmBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmNovation
 * SecuritiesClearing.mmNovation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmNetting
 * SecuritiesClearing.mmNetting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesClearing
 * SecuritiesSettlement.mmSecuritiesClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyIn#mmRelatedSecuritiesClearingProcess
 * BuyIn.mmRelatedSecuritiesClearingProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Netting#mmRelatedSecuritiesClearingProcess
 * Netting.mmRelatedSecuritiesClearingProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Novation#mmSecuritiesClearing
 * Novation.mmSecuritiesClearing}</li>
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
 * "SecuritiesClearing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Process of settling securities through a central system."</li>
 * </ul>
 */
public class SecuritiesClearing extends Clearing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement;
	/**
	 * Settlement process performed as part of the securities clearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesClearing
	 * SecuritiesSettlement.mmSecuritiesClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing
	 * SecuritiesClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement process performed as part of the securities clearing."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Settlement process performed as part of the securities clearing.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesClearing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.BuyIn> buyIn;
	/**
	 * Buy-in process performed as part of the securities clearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmRelatedSecuritiesClearingProcess
	 * BuyIn.mmRelatedSecuritiesClearingProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing
	 * SecuritiesClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Buy-in process performed as part of the securities clearing."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBuyIn = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyIn";
			definition = "Buy-in process performed as part of the securities clearing.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.mmRelatedSecuritiesClearingProcess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Novation> novation;
	/**
	 * Novation process performed as part of the securities clearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Novation#mmSecuritiesClearing
	 * Novation.mmSecuritiesClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Novation Novation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing
	 * SecuritiesClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Novation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Novation process performed as part of the securities clearing."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNovation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Novation";
			definition = "Novation process performed as part of the securities clearing.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Novation.mmSecuritiesClearing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Novation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Netting> netting;
	/**
	 * Netting process performed as part of the securities clearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Netting#mmRelatedSecuritiesClearingProcess
	 * Netting.mmRelatedSecuritiesClearingProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Netting Netting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing
	 * SecuritiesClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Netting process performed as part of the securities clearing."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Netting process performed as part of the securities clearing.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Netting.mmRelatedSecuritiesClearingProcess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesClearing";
				definition = "Process of settling securities through a central system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesClearing, com.tools20022.repository.entity.BuyIn.mmRelatedSecuritiesClearingProcess,
						com.tools20022.repository.entity.Netting.mmRelatedSecuritiesClearingProcess, com.tools20022.repository.entity.Novation.mmSecuritiesClearing);
				superType_lazy = () -> Clearing.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesClearing.mmSecuritiesSettlement, com.tools20022.repository.entity.SecuritiesClearing.mmBuyIn,
						com.tools20022.repository.entity.SecuritiesClearing.mmNovation, com.tools20022.repository.entity.SecuritiesClearing.mmNetting);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesClearing.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesSettlement> getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public void setSecuritiesSettlement(List<com.tools20022.repository.entity.SecuritiesSettlement> securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
	}

	public List<BuyIn> getBuyIn() {
		return buyIn;
	}

	public void setBuyIn(List<com.tools20022.repository.entity.BuyIn> buyIn) {
		this.buyIn = buyIn;
	}

	public List<Novation> getNovation() {
		return novation;
	}

	public void setNovation(List<com.tools20022.repository.entity.Novation> novation) {
		this.novation = novation;
	}

	public List<Netting> getNetting() {
		return netting;
	}

	public void setNetting(List<com.tools20022.repository.entity.Netting> netting) {
		this.netting = netting;
	}
}