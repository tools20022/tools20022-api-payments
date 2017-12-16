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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides the agreed amount and the collateral movement direction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralMovement" src="doc-files/CollateralMovement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmRelatedCollateralProposal
 * CollateralMovement.mmRelatedCollateralProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmVariationMargin
 * CollateralMovement.mmVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmSegregatedIndependentAmount
 * CollateralMovement.mmSegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmMarginCall
 * CollateralMovement.mmMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmSecuritiesCollateralMovement
 * CollateralMovement.mmSecuritiesCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmCashCollateralMovement
 * CollateralMovement.mmCashCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmFinancialTransaction
 * CollateralMovement.mmFinancialTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedCollateralMovement
 * PaymentObligation.mmRelatedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedCollateralMovement
 * SecuritiesDeliveryObligation.mmRelatedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmCollateralMovement
 * MarginCall.mmCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmProposedCollateralMovement
 * CollateralProposal.mmProposedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmCollateralMovement
 * FinancialTransaction.mmCollateralMovement}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralMovement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the agreed amount and the collateral movement direction."</li>
 * </ul>
 */
public class CollateralMovement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CollateralProposal relatedCollateralProposal;
	/**
	 * Collateral proposal for which collateral movements are detailed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmProposedCollateralMovement
	 * CollateralProposal.mmProposedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralProposal
	 * CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralProposal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral proposal for which collateral movements are detailed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCollateralProposal = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralProposal";
			definition = "Collateral proposal for which collateral movements are detailed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmProposedCollateralMovement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmObject();
		}
	};
	protected CurrencyAndAmount variationMargin;
	/**
	 * Amount of margin that will be delivered to one party by the other party
	 * after rounding, threshold and minimum transfer amount are taken into
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmVariationMargin = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Amount of margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralMovement.class.getMethod("getVariationMargin", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount segregatedIndependentAmount;
	/**
	 * Amount of margin that will be delivered to one party by the other party
	 * after rounding, threshold and minimum transfer amount are taken into
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSegregatedIndependentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Amount of margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralMovement.class.getMethod("getSegregatedIndependentAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.MarginCall> marginCall;
	/**
	 * Magin call which needs to be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmCollateralMovement
	 * MarginCall.mmCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarginCall
	 * MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Magin call which needs to be executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMarginCall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCall";
			definition = "Magin call which needs to be executed.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.mmCollateralMovement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesCollateralMovement;
	/**
	 * Movement of assets in relation with collateral updates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedCollateralMovement
	 * SecuritiesDeliveryObligation.mmRelatedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Movement of assets in relation with collateral updates."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesCollateralMovement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCollateralMovement";
			definition = "Movement of assets in relation with collateral updates.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmRelatedCollateralMovement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligation> cashCollateralMovement;
	/**
	 * Movement of assets in relation with collateral updates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedCollateralMovement
	 * PaymentObligation.mmRelatedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Movement of assets in relation with collateral updates."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashCollateralMovement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCollateralMovement";
			definition = "Movement of assets in relation with collateral updates.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmRelatedCollateralMovement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected FinancialTransaction financialTransaction;
	/**
	 * Financial transaction to which the collateral management is associated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmCollateralMovement
	 * FinancialTransaction.mmCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial transaction to which the collateral management is associated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFinancialTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the collateral management is associated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmCollateralMovement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralMovement";
				definition = "Provides the agreed amount and the collateral movement direction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.mmRelatedCollateralMovement, com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmRelatedCollateralMovement,
						com.tools20022.repository.entity.MarginCall.mmCollateralMovement, com.tools20022.repository.entity.CollateralProposal.mmProposedCollateralMovement,
						com.tools20022.repository.entity.FinancialTransaction.mmCollateralMovement);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralMovement.mmRelatedCollateralProposal, com.tools20022.repository.entity.CollateralMovement.mmVariationMargin,
						com.tools20022.repository.entity.CollateralMovement.mmSegregatedIndependentAmount, com.tools20022.repository.entity.CollateralMovement.mmMarginCall,
						com.tools20022.repository.entity.CollateralMovement.mmSecuritiesCollateralMovement, com.tools20022.repository.entity.CollateralMovement.mmCashCollateralMovement,
						com.tools20022.repository.entity.CollateralMovement.mmFinancialTransaction);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralMovement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CollateralProposal getRelatedCollateralProposal() {
		return relatedCollateralProposal;
	}

	public void setRelatedCollateralProposal(com.tools20022.repository.entity.CollateralProposal relatedCollateralProposal) {
		this.relatedCollateralProposal = relatedCollateralProposal;
	}

	public CurrencyAndAmount getVariationMargin() {
		return variationMargin;
	}

	public void setVariationMargin(CurrencyAndAmount variationMargin) {
		this.variationMargin = variationMargin;
	}

	public CurrencyAndAmount getSegregatedIndependentAmount() {
		return segregatedIndependentAmount;
	}

	public void setSegregatedIndependentAmount(CurrencyAndAmount segregatedIndependentAmount) {
		this.segregatedIndependentAmount = segregatedIndependentAmount;
	}

	public List<MarginCall> getMarginCall() {
		return marginCall;
	}

	public void setMarginCall(List<com.tools20022.repository.entity.MarginCall> marginCall) {
		this.marginCall = marginCall;
	}

	public List<SecuritiesDeliveryObligation> getSecuritiesCollateralMovement() {
		return securitiesCollateralMovement;
	}

	public void setSecuritiesCollateralMovement(List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesCollateralMovement) {
		this.securitiesCollateralMovement = securitiesCollateralMovement;
	}

	public List<PaymentObligation> getCashCollateralMovement() {
		return cashCollateralMovement;
	}

	public void setCashCollateralMovement(List<com.tools20022.repository.entity.PaymentObligation> cashCollateralMovement) {
		this.cashCollateralMovement = cashCollateralMovement;
	}

	public FinancialTransaction getFinancialTransaction() {
		return financialTransaction;
	}

	public void setFinancialTransaction(com.tools20022.repository.entity.FinancialTransaction financialTransaction) {
		this.financialTransaction = financialTransaction;
	}
}