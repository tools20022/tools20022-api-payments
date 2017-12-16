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
import com.tools20022.repository.codeset.FlowDirectionTypeCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cash movements from or to a fund as a result of investment funds
 * transactions, for example, subscriptions or redemptions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FundsCashFlow" src="doc-files/FundsCashFlow.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmExceptionalCashFlowIndicator
 * FundsCashFlow.mmExceptionalCashFlowIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFlowDirection
 * FundsCashFlow.mmFlowDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFundSubscriptionAccountEntry
 * FundsCashFlow.mmFundSubscriptionAccountEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFundRedemptionAccountEntry
 * FundsCashFlow.mmFundRedemptionAccountEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmRelatedOrder
 * FundsCashFlow.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmNetIndicator
 * FundsCashFlow.mmNetIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmNetAssetValueCalculation
 * FundsCashFlow.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmCashFlowQuantity
 * FundsCashFlow.mmCashFlowQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmFundsCashFlow
 * NetAssetValueCalculation.mmFundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCashFlow
 * SecuritiesQuantity.mmRelatedCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmCashFlow
 * InvestmentFundOrderExecution.mmCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundSubscriptionCashInFlow
 * BookEntry.mmFundSubscriptionCashInFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundRedemptionCashOutFlow
 * BookEntry.mmFundRedemptionCashOutFlow}</li>
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
 * "FundsCashFlow"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash movements from or to a fund as a result of investment funds transactions, for example, subscriptions or redemptions."
 * </li>
 * </ul>
 */
public class FundsCashFlow {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator exceptionalCashFlowIndicator;
	/**
	 * Indicates whether the cash flow is exceptional , eg, extraordinary cash
	 * amounts in or out.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cash flow is exceptional , eg, extraordinary cash amounts in or out."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExceptionalCashFlowIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExceptionalCashFlowIndicator";
			definition = "Indicates whether the cash flow is exceptional , eg, extraordinary cash amounts in or out.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundsCashFlow.class.getMethod("getExceptionalCashFlowIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FlowDirectionTypeCode flowDirection;
	/**
	 * Specifies the direction of the cash flow from the perspective of the
	 * fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FlowDirectionTypeCode
	 * FlowDirectionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlowDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the direction of the cash flow from the perspective of the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFlowDirection = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FlowDirection";
			definition = "Specifies the direction of the cash flow from the perspective of the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FlowDirectionTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundsCashFlow.class.getMethod("getFlowDirection", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BookEntry fundSubscriptionAccountEntry;
	/**
	 * Account entry which is linked to a fund subscription process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundSubscriptionCashInFlow
	 * BookEntry.mmFundSubscriptionCashInFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundSubscriptionAccountEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account entry which is linked to a fund subscription process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFundSubscriptionAccountEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundSubscriptionAccountEntry";
			definition = "Account entry which is linked to a fund subscription process.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.mmFundSubscriptionCashInFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
		}
	};
	protected BookEntry fundRedemptionAccountEntry;
	/**
	 * Account entry which is linked to a fund redemption process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundRedemptionCashOutFlow
	 * BookEntry.mmFundRedemptionCashOutFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundRedemptionAccountEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account entry which is linked to a fund redemption process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFundRedemptionAccountEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundRedemptionAccountEntry";
			definition = "Account entry which is linked to a fund redemption process.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.mmFundRedemptionCashOutFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
		}
	};
	protected InvestmentFundOrderExecution relatedOrder;
	/**
	 * Trade which is the source for the calculation of the cash flow movements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmCashFlow
	 * InvestmentFundOrderExecution.mmCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade which is the source for the calculation of the cash flow movements."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Trade which is the source for the calculation of the cash flow movements.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmCashFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
		}
	};
	protected YesNoIndicator netIndicator;
	/**
	 * Indicates whether the cash flow is the result of netting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the cash flow is the result of netting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNetIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetIndicator";
			definition = "Indicates whether the cash flow is the result of netting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundsCashFlow.class.getMethod("getNetIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected NetAssetValueCalculation netAssetValueCalculation;
	/**
	 * Net asset value incorporating the net cash flow for a valuation date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmFundsCashFlow
	 * NetAssetValueCalculation.mmFundsCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value incorporating the net cash flow for a valuation date."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Net asset value incorporating the net cash flow for a valuation date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmFundsCashFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected SecuritiesQuantity cashFlowQuantity;
	/**
	 * Value and quantity of the cash flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedCashFlow
	 * SecuritiesQuantity.mmRelatedCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashFlowQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value and quantity of the cash flow."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashFlowQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashFlowQuantity";
			definition = "Value and quantity of the cash flow.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedCashFlow;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundsCashFlow";
				definition = "Cash movements from or to a fund as a result of investment funds transactions, for example, subscriptions or redemptions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetAssetValueCalculation.mmFundsCashFlow, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedCashFlow,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmCashFlow, com.tools20022.repository.entity.BookEntry.mmFundSubscriptionCashInFlow,
						com.tools20022.repository.entity.BookEntry.mmFundRedemptionCashOutFlow);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FundsCashFlow.mmExceptionalCashFlowIndicator, com.tools20022.repository.entity.FundsCashFlow.mmFlowDirection,
						com.tools20022.repository.entity.FundsCashFlow.mmFundSubscriptionAccountEntry, com.tools20022.repository.entity.FundsCashFlow.mmFundRedemptionAccountEntry,
						com.tools20022.repository.entity.FundsCashFlow.mmRelatedOrder, com.tools20022.repository.entity.FundsCashFlow.mmNetIndicator, com.tools20022.repository.entity.FundsCashFlow.mmNetAssetValueCalculation,
						com.tools20022.repository.entity.FundsCashFlow.mmCashFlowQuantity);
			}

			@Override
			public Class<?> getInstanceClass() {
				return FundsCashFlow.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getExceptionalCashFlowIndicator() {
		return exceptionalCashFlowIndicator;
	}

	public void setExceptionalCashFlowIndicator(YesNoIndicator exceptionalCashFlowIndicator) {
		this.exceptionalCashFlowIndicator = exceptionalCashFlowIndicator;
	}

	public FlowDirectionTypeCode getFlowDirection() {
		return flowDirection;
	}

	public void setFlowDirection(FlowDirectionTypeCode flowDirection) {
		this.flowDirection = flowDirection;
	}

	public BookEntry getFundSubscriptionAccountEntry() {
		return fundSubscriptionAccountEntry;
	}

	public void setFundSubscriptionAccountEntry(com.tools20022.repository.entity.BookEntry fundSubscriptionAccountEntry) {
		this.fundSubscriptionAccountEntry = fundSubscriptionAccountEntry;
	}

	public BookEntry getFundRedemptionAccountEntry() {
		return fundRedemptionAccountEntry;
	}

	public void setFundRedemptionAccountEntry(com.tools20022.repository.entity.BookEntry fundRedemptionAccountEntry) {
		this.fundRedemptionAccountEntry = fundRedemptionAccountEntry;
	}

	public InvestmentFundOrderExecution getRelatedOrder() {
		return relatedOrder;
	}

	public void setRelatedOrder(com.tools20022.repository.entity.InvestmentFundOrderExecution relatedOrder) {
		this.relatedOrder = relatedOrder;
	}

	public YesNoIndicator getNetIndicator() {
		return netIndicator;
	}

	public void setNetIndicator(YesNoIndicator netIndicator) {
		this.netIndicator = netIndicator;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return netAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation netAssetValueCalculation) {
		this.netAssetValueCalculation = netAssetValueCalculation;
	}

	public SecuritiesQuantity getCashFlowQuantity() {
		return cashFlowQuantity;
	}

	public void setCashFlowQuantity(com.tools20022.repository.entity.SecuritiesQuantity cashFlowQuantity) {
		this.cashFlowQuantity = cashFlowQuantity;
	}
}