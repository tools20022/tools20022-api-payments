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
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.entity.TreasuryTrade;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Right to buy (call) or sell (put) an underlying amount in one currency
 * against another amount in another currency at a predetermined exchange rate,
 * within a specified period of time or at a specified date and time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CurrencyOption" src="doc-files/CurrencyOption.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
 * TreasuryTrade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyOption#mmCallAmount
 * CurrencyOption.mmCallAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyOption#mmPutAmount
 * CurrencyOption.mmPutAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmPremiumCalculation
 * CurrencyOption.mmPremiumCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmOptionDefinition
 * CurrencyOption.mmOptionDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmPremiumSettlement
 * CurrencyOption.mmPremiumSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmExercisedOption
 * CurrencyOption.mmExercisedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmOptionSettlementCurrency
 * CurrencyOption.mmOptionSettlementCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyOption#mmStrikeRate
 * CurrencyOption.mmStrikeRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceCurrencyOption
 * PaymentObligation.mmPaymentSourceCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmRelatedOption
 * ForeignExchangeTrade.mmRelatedOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmCurrencyOption
 * Option.mmCurrencyOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PremiumCalculation#mmOption
 * PremiumCalculation.mmOption}</li>
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
 * "CurrencyOption"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Right to buy (call) or sell (put) an underlying amount in one currency against another amount in another currency at a predetermined exchange rate, within a specified period of time or at a specified date and time."
 * </li>
 * </ul>
 */
public class CurrencyOption extends TreasuryTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveOrHistoricCurrencyAndAmount callAmount;
	/**
	 * Call amount and currency of a foreign exchange option trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Call amount and currency of a foreign exchange option trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCallAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CallAmount";
			definition = "Call amount and currency of a foreign exchange option trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyOption.class.getMethod("getCallAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount putAmount;
	/**
	 * Put amount and currency of a foreign exchange option trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Put amount and currency of a foreign exchange option trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPutAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PutAmount";
			definition = "Put amount and currency of a foreign exchange option trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyOption.class.getMethod("getPutAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PremiumCalculation premiumCalculation;
	/**
	 * Specifies the way the premium is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation#mmOption
	 * PremiumCalculation.mmOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PremiumCalculation
	 * PremiumCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the way the premium is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPremiumCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PremiumCalculation";
			definition = "Specifies the way the premium is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PremiumCalculation.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PremiumCalculation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Option> optionDefinition;
	/**
	 * Specifies the different parameters used to define an option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmCurrencyOption
	 * Option.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Option Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different parameters used to define an option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOptionDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionDefinition";
			definition = "Specifies the different parameters used to define an option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Option.mmCurrencyOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligation> premiumSettlement;
	/**
	 * Specifies the amount of the premium paid by the buyer of the option and
	 * its settlement place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceCurrencyOption
	 * PaymentObligation.mmPaymentSourceCurrencyOption}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount of the premium paid by the buyer of the option and its settlement place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPremiumSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PremiumSettlement";
			definition = "Specifies the amount of the premium paid by the buyer of the option and its settlement place.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceCurrencyOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ForeignExchangeTrade> exercisedOption;
	/**
	 * Specifies the trade that may take place to exercise the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmRelatedOption
	 * ForeignExchangeTrade.mmRelatedOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisedOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade that may take place to exercise the option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExercisedOption = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExercisedOption";
			definition = "Specifies the trade that may take place to exercise the option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmRelatedOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode optionSettlementCurrency;
	/**
	 * Currency that must be used to settle the option when it is netted off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency that must be used to settle the option when it is netted off."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOptionSettlementCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionSettlementCurrency";
			definition = "Currency that must be used to settle the option when it is netted off.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyOption.class.getMethod("getOptionSettlementCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BaseOneRate strikeRate;
	/**
	 * Fixed exchange rate at which the option contract can be exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fixed exchange rate at which the option contract can be exercised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStrikeRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrikeRate";
			definition = "Fixed exchange rate at which the option contract can be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyOption.class.getMethod("getStrikeRate", new Class[]{});
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
				name = "CurrencyOption";
				definition = "Right to buy (call) or sell (put) an underlying amount in one currency against another amount in another currency at a predetermined exchange rate, within a specified period of time or at a specified date and time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceCurrencyOption, com.tools20022.repository.entity.ForeignExchangeTrade.mmRelatedOption,
						com.tools20022.repository.entity.Option.mmCurrencyOption, com.tools20022.repository.entity.PremiumCalculation.mmOption);
				superType_lazy = () -> TreasuryTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyOption.mmCallAmount, com.tools20022.repository.entity.CurrencyOption.mmPutAmount,
						com.tools20022.repository.entity.CurrencyOption.mmPremiumCalculation, com.tools20022.repository.entity.CurrencyOption.mmOptionDefinition, com.tools20022.repository.entity.CurrencyOption.mmPremiumSettlement,
						com.tools20022.repository.entity.CurrencyOption.mmExercisedOption, com.tools20022.repository.entity.CurrencyOption.mmOptionSettlementCurrency, com.tools20022.repository.entity.CurrencyOption.mmStrikeRate);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CurrencyOption.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getCallAmount() {
		return callAmount;
	}

	public void setCallAmount(ActiveOrHistoricCurrencyAndAmount callAmount) {
		this.callAmount = callAmount;
	}

	public ActiveOrHistoricCurrencyAndAmount getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(ActiveOrHistoricCurrencyAndAmount putAmount) {
		this.putAmount = putAmount;
	}

	public PremiumCalculation getPremiumCalculation() {
		return premiumCalculation;
	}

	public void setPremiumCalculation(com.tools20022.repository.entity.PremiumCalculation premiumCalculation) {
		this.premiumCalculation = premiumCalculation;
	}

	public List<Option> getOptionDefinition() {
		return optionDefinition;
	}

	public void setOptionDefinition(List<com.tools20022.repository.entity.Option> optionDefinition) {
		this.optionDefinition = optionDefinition;
	}

	public List<PaymentObligation> getPremiumSettlement() {
		return premiumSettlement;
	}

	public void setPremiumSettlement(List<com.tools20022.repository.entity.PaymentObligation> premiumSettlement) {
		this.premiumSettlement = premiumSettlement;
	}

	public List<ForeignExchangeTrade> getExercisedOption() {
		return exercisedOption;
	}

	public void setExercisedOption(List<com.tools20022.repository.entity.ForeignExchangeTrade> exercisedOption) {
		this.exercisedOption = exercisedOption;
	}

	public ActiveOrHistoricCurrencyCode getOptionSettlementCurrency() {
		return optionSettlementCurrency;
	}

	public void setOptionSettlementCurrency(ActiveOrHistoricCurrencyCode optionSettlementCurrency) {
		this.optionSettlementCurrency = optionSettlementCurrency;
	}

	public BaseOneRate getStrikeRate() {
		return strikeRate;
	}

	public void setStrikeRate(BaseOneRate strikeRate) {
		this.strikeRate = strikeRate;
	}
}