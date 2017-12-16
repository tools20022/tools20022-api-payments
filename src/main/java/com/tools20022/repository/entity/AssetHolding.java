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
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.codeset.BlockedReasonCode;
import com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode;
import com.tools20022.repository.codeset.UnrealisedCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashCollateral5;
import com.tools20022.repository.msg.OriginalAndCurrentQuantities1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies in terms of value and quantity the assets.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AssetHolding" src="doc-files/AssetHolding.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmHoldingValue
 * AssetHolding.mmHoldingValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
 * AssetHolding.mmBookValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmFaceAmount
 * AssetHolding.mmFaceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmAmortisedFaceValue
 * AssetHolding.mmAmortisedFaceValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmMarketValue
 * AssetHolding.mmMarketValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmBalance
 * AssetHolding.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmUnrealisedGainOrLoss
 * AssetHolding.mmUnrealisedGainOrLoss}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmAsset
 * AssetHolding.mmAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmHaircut
 * AssetHolding.mmHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmEligibleCollateralValue
 * AssetHolding.mmEligibleCollateralValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
 * AssetHolding.mmExchangeRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmCapValue
 * AssetHolding.mmCapValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmRiskAdjustedValue
 * AssetHolding.mmRiskAdjustedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmRealisedGainOrLoss
 * AssetHolding.mmRealisedGainOrLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmUnrealisedType
 * AssetHolding.mmUnrealisedType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmPostHaircutValue
 * AssetHolding.mmPostHaircutValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmInterest
 * AssetHolding.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmCollateral
 * AssetHolding.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmFinancialAssetType
 * AssetHolding.mmFinancialAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmVariationMarginCollateral
 * AssetHolding.mmVariationMarginCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmIndependentAmountCollateral
 * AssetHolding.mmIndependentAmountCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmHoldingType
 * AssetHolding.mmHoldingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmGuaranteeAmount
 * AssetHolding.mmGuaranteeAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmAssetValue
 * Asset.mmAssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
 * Balance.mmAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAssetHolding
 * Interest.mmRelatedAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCalculatedAssetValue
 * CurrencyExchange.mmCalculatedAssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#mmAssetHolding
 * Collateral.mmAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmVariationMarginAssetHolding
 * Collateral.mmVariationMarginAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmSegregatedIndependentAmountAssetHolding
 * Collateral.mmSegregatedIndependentAmountAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmAssetHolding
 * HaircutValuation.mmAssetHolding}</li>
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
 * "AssetHolding"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies in terms of value and quantity the assets."</li>
 * </ul>
 */
public class AssetHolding {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveOrHistoricCurrencyAndAmount holdingValue;
	/**
	 * Value of the balance of an individual securities holding.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the balance of an individual securities holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHoldingValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingValue";
			definition = "Value of the balance of an individual securities holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getHoldingValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount bookValue;
	/**
	 * Value of a security, as booked/acquired in an account. Book value is
	 * often different from the current market value of the security.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of a security, as booked/acquired in an account. Book value is often different from the current market value of the security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBookValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookValue";
			definition = "Value of a security, as booked/acquired in an account. Book value is often different from the current market value of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getBookValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount faceAmount;
	/**
	 * Quantity expressed as an amount representing the face amount, ie, the
	 * principal, of a debt instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities1#mmFaceAmount
	 * OriginalAndCurrentQuantities1.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#mmFaceAmount
	 * FinancialInstrumentQuantityChoice.mmFaceAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FaceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount representing the face amount, ie, the principal, of a debt instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFaceAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalAndCurrentQuantities1.mmFaceAmount, FinancialInstrumentQuantityChoice.mmFaceAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FaceAmount";
			definition = "Quantity expressed as an amount representing the face amount, ie, the principal, of a debt instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getFaceAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount amortisedFaceValue;
	/**
	 * Quantity expressed as an amount representing the current amortised face
	 * amount of a bond, for example, a periodic reduction/increase of a bond's
	 * principal amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities1#mmAmortisedValue
	 * OriginalAndCurrentQuantities1.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#mmAmortisedValue
	 * FinancialInstrumentQuantityChoice.mmAmortisedValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmortisedFaceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount representing the current amortised face amount of a bond, for example, a periodic reduction/increase of a bond's principal amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmortisedFaceValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalAndCurrentQuantities1.mmAmortisedValue, FinancialInstrumentQuantityChoice.mmAmortisedValue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmortisedFaceValue";
			definition = "Quantity expressed as an amount representing the current amortised face amount of a bond, for example, a periodic reduction/increase of a bond's principal amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getAmortisedFaceValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount marketValue;
	/**
	 * Value of the asset holding based on current market prices.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the asset holding based on current market prices."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarketValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketValue";
			definition = "Value of the asset holding based on current market prices.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getMarketValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Balance> balance;
	/**
	 * Specifies the balance of the asset holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the balance of the asset holding."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Specifies the balance of the asset holding.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.mmAssetHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
		}
	};
	protected CurrencyAndAmount unrealisedGainOrLoss;
	/**
	 * Difference between the holding value and the book value of the asset.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrealisedGainOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the holding value and the book value of the asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnrealisedGainOrLoss = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnrealisedGainOrLoss";
			definition = "Difference between the holding value and the book value of the asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getUnrealisedGainOrLoss", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Asset asset;
	/**
	 * Specifies the asset included in the holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmAssetValue
	 * Asset.mmAssetValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the asset included in the holding."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAsset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Specifies the asset included in the holding.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.mmAssetValue;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.HaircutValuation> haircut;
	/**
	 * Percentage by which an asset's market value is reduced for the purpose of
	 * calculating capital requirement, margin and collateral levels.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmAssetHolding
	 * HaircutValuation.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.HaircutValuation
	 * HaircutValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Haircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage by which an asset's market value is reduced for the purpose of calculating capital requirement, margin and collateral levels."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmHaircut = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Haircut";
			definition = "Percentage by which an asset's market value is reduced for the purpose of calculating capital requirement, margin and collateral levels.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.HaircutValuation.mmAssetHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.HaircutValuation.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount eligibleCollateralValue;
	/**
	 * Value of the position eligible for collateral purposes. This corresponds
	 * to the sub balance with a type AvailableForCollateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleCollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the position eligible for collateral purposes. This corresponds to the sub balance with a type AvailableForCollateral."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEligibleCollateralValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleCollateralValue";
			definition = "Value of the position eligible for collateral purposes. This corresponds to the sub balance with a type AvailableForCollateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getEligibleCollateralValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyExchange exchangeRate;
	/**
	 * Specifies the exchange rate between the currency of the asset and the
	 * reporting currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCalculatedAssetValue
	 * CurrencyExchange.mmCalculatedAssetValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#mmExchangeRate
	 * CashCollateral5.mmExchangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the exchange rate between the currency of the asset and the reporting currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExchangeRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CashCollateral5.mmExchangeRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate between the currency of the asset and the reporting currency.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmCalculatedAssetValue;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected CurrencyAndAmount capValue;
	/**
	 * Maximum notional value for a financial instrument that is capped.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum notional value for a financial instrument that is capped."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCapValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapValue";
			definition = "Maximum notional value for a financial instrument that is capped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getCapValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount riskAdjustedValue;
	/**
	 * Value of the asset holding after deduction of a percentage (the haircut)
	 * that reflects the perceived risk associated with holding this asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#mmCollateralValue
	 * CashCollateral5.mmCollateralValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskAdjustedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the asset holding after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this asset."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRiskAdjustedValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashCollateral5.mmCollateralValue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RiskAdjustedValue";
			definition = "Value of the asset holding after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getRiskAdjustedValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount realisedGainOrLoss;
	/**
	 * Difference between the realised value caused by the actual
	 * trade/re-evaluation and the book value of the asset.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealisedGainOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the realised value caused by the actual trade/re-evaluation and the book value of the asset."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRealisedGainOrLoss = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RealisedGainOrLoss";
			definition = "Difference between the realised value caused by the actual trade/re-evaluation and the book value of the asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getRealisedGainOrLoss", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected UnrealisedCode unrealisedType;
	/**
	 * Specifies whether the unrealised amount is a gain or a loss.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnrealisedCode
	 * UnrealisedCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrealisedType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the unrealised amount is a gain or a loss."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnrealisedType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnrealisedType";
			definition = "Specifies whether the unrealised amount is a gain or a loss.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnrealisedCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getUnrealisedType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount postHaircutValue;
	/**
	 * Value of the collateral after deduction of a percentage (the haircut)
	 * that reflects the perceived risk associated with holding this collateral.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostHaircutValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPostHaircutValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PostHaircutValue";
			definition = "Value of the collateral after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getPostHaircutValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Interest> interest;
	/**
	 * interest relative to the asset and the parameters used to calculate it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAssetHolding
	 * Interest.mmRelatedAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "interest relative to the asset and the parameters used to calculate it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "interest relative to the asset and the parameters used to calculate it.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmRelatedAssetHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Collateral> collateral;
	/**
	 * Specifies the collateral information in relation with some assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmAssetHolding
	 * Collateral.mmAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral information in relation with some assets."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCollateral = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Specifies the collateral information in relation with some assets.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmAssetHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	protected FinancialAssetBalanceTypeCode financialAssetType;
	/**
	 * Specifies the asset type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAssetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the asset type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFinancialAssetType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialAssetType";
			definition = "Specifies the asset type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getFinancialAssetType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Collateral variationMarginCollateral;
	/**
	 * Specifies the collateral information in relation with the segregated
	 * independent amount asset holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmVariationMarginAssetHolding
	 * Collateral.mmVariationMarginAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral information in relation with the segregated independent amount asset holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmVariationMarginCollateral = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariationMarginCollateral";
			definition = "Specifies the collateral information in relation with the segregated independent amount asset holding.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmVariationMarginAssetHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	protected Collateral independentAmountCollateral;
	/**
	 * Specifies the collateral information in relation with the segregated
	 * independent amount asset holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmSegregatedIndependentAmountAssetHolding
	 * Collateral.mmSegregatedIndependentAmountAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndependentAmountCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral information in relation with the segregated independent amount asset holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIndependentAmountCollateral = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndependentAmountCollateral";
			definition = "Specifies the collateral information in relation with the segregated independent amount asset holding.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmSegregatedIndependentAmountAssetHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	protected BlockedReasonCode holdingType;
	/**
	 * Specifies the type of holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
	 * BlockedReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of holding."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHoldingType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingType";
			definition = "Specifies the type of holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BlockedReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getHoldingType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount guaranteeAmount;
	/**
	 * Amount of the bank guarantee.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the bank guarantee."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmGuaranteeAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteeAmount";
			definition = "Amount of the bank guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getGuaranteeAmount", new Class[]{});
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
				name = "AssetHolding";
				definition = "Specifies in terms of value and quantity the assets.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.mmAssetValue, com.tools20022.repository.entity.Balance.mmAssetHolding, com.tools20022.repository.entity.Interest.mmRelatedAssetHolding,
						com.tools20022.repository.entity.CurrencyExchange.mmCalculatedAssetValue, com.tools20022.repository.entity.Collateral.mmAssetHolding, com.tools20022.repository.entity.Collateral.mmVariationMarginAssetHolding,
						com.tools20022.repository.entity.Collateral.mmSegregatedIndependentAmountAssetHolding, com.tools20022.repository.entity.HaircutValuation.mmAssetHolding);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetHolding.mmHoldingValue, com.tools20022.repository.entity.AssetHolding.mmBookValue, com.tools20022.repository.entity.AssetHolding.mmFaceAmount,
						com.tools20022.repository.entity.AssetHolding.mmAmortisedFaceValue, com.tools20022.repository.entity.AssetHolding.mmMarketValue, com.tools20022.repository.entity.AssetHolding.mmBalance,
						com.tools20022.repository.entity.AssetHolding.mmUnrealisedGainOrLoss, com.tools20022.repository.entity.AssetHolding.mmAsset, com.tools20022.repository.entity.AssetHolding.mmHaircut,
						com.tools20022.repository.entity.AssetHolding.mmEligibleCollateralValue, com.tools20022.repository.entity.AssetHolding.mmExchangeRate, com.tools20022.repository.entity.AssetHolding.mmCapValue,
						com.tools20022.repository.entity.AssetHolding.mmRiskAdjustedValue, com.tools20022.repository.entity.AssetHolding.mmRealisedGainOrLoss, com.tools20022.repository.entity.AssetHolding.mmUnrealisedType,
						com.tools20022.repository.entity.AssetHolding.mmPostHaircutValue, com.tools20022.repository.entity.AssetHolding.mmInterest, com.tools20022.repository.entity.AssetHolding.mmCollateral,
						com.tools20022.repository.entity.AssetHolding.mmFinancialAssetType, com.tools20022.repository.entity.AssetHolding.mmVariationMarginCollateral,
						com.tools20022.repository.entity.AssetHolding.mmIndependentAmountCollateral, com.tools20022.repository.entity.AssetHolding.mmHoldingType, com.tools20022.repository.entity.AssetHolding.mmGuaranteeAmount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return AssetHolding.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getHoldingValue() {
		return holdingValue;
	}

	public void setHoldingValue(ActiveOrHistoricCurrencyAndAmount holdingValue) {
		this.holdingValue = holdingValue;
	}

	public CurrencyAndAmount getBookValue() {
		return bookValue;
	}

	public void setBookValue(CurrencyAndAmount bookValue) {
		this.bookValue = bookValue;
	}

	public CurrencyAndAmount getFaceAmount() {
		return faceAmount;
	}

	public void setFaceAmount(CurrencyAndAmount faceAmount) {
		this.faceAmount = faceAmount;
	}

	public CurrencyAndAmount getAmortisedFaceValue() {
		return amortisedFaceValue;
	}

	public void setAmortisedFaceValue(CurrencyAndAmount amortisedFaceValue) {
		this.amortisedFaceValue = amortisedFaceValue;
	}

	public ActiveCurrencyAndAmount getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(ActiveCurrencyAndAmount marketValue) {
		this.marketValue = marketValue;
	}

	public List<Balance> getBalance() {
		return balance;
	}

	public void setBalance(List<com.tools20022.repository.entity.Balance> balance) {
		this.balance = balance;
	}

	public CurrencyAndAmount getUnrealisedGainOrLoss() {
		return unrealisedGainOrLoss;
	}

	public void setUnrealisedGainOrLoss(CurrencyAndAmount unrealisedGainOrLoss) {
		this.unrealisedGainOrLoss = unrealisedGainOrLoss;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(com.tools20022.repository.entity.Asset asset) {
		this.asset = asset;
	}

	public List<HaircutValuation> getHaircut() {
		return haircut;
	}

	public void setHaircut(List<com.tools20022.repository.entity.HaircutValuation> haircut) {
		this.haircut = haircut;
	}

	public ActiveCurrencyAndAmount getEligibleCollateralValue() {
		return eligibleCollateralValue;
	}

	public void setEligibleCollateralValue(ActiveCurrencyAndAmount eligibleCollateralValue) {
		this.eligibleCollateralValue = eligibleCollateralValue;
	}

	public CurrencyExchange getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(com.tools20022.repository.entity.CurrencyExchange exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public CurrencyAndAmount getCapValue() {
		return capValue;
	}

	public void setCapValue(CurrencyAndAmount capValue) {
		this.capValue = capValue;
	}

	public ActiveCurrencyAndAmount getRiskAdjustedValue() {
		return riskAdjustedValue;
	}

	public void setRiskAdjustedValue(ActiveCurrencyAndAmount riskAdjustedValue) {
		this.riskAdjustedValue = riskAdjustedValue;
	}

	public CurrencyAndAmount getRealisedGainOrLoss() {
		return realisedGainOrLoss;
	}

	public void setRealisedGainOrLoss(CurrencyAndAmount realisedGainOrLoss) {
		this.realisedGainOrLoss = realisedGainOrLoss;
	}

	public UnrealisedCode getUnrealisedType() {
		return unrealisedType;
	}

	public void setUnrealisedType(UnrealisedCode unrealisedType) {
		this.unrealisedType = unrealisedType;
	}

	public CurrencyAndAmount getPostHaircutValue() {
		return postHaircutValue;
	}

	public void setPostHaircutValue(CurrencyAndAmount postHaircutValue) {
		this.postHaircutValue = postHaircutValue;
	}

	public List<Interest> getInterest() {
		return interest;
	}

	public void setInterest(List<com.tools20022.repository.entity.Interest> interest) {
		this.interest = interest;
	}

	public List<Collateral> getCollateral() {
		return collateral;
	}

	public void setCollateral(List<com.tools20022.repository.entity.Collateral> collateral) {
		this.collateral = collateral;
	}

	public FinancialAssetBalanceTypeCode getFinancialAssetType() {
		return financialAssetType;
	}

	public void setFinancialAssetType(FinancialAssetBalanceTypeCode financialAssetType) {
		this.financialAssetType = financialAssetType;
	}

	public Collateral getVariationMarginCollateral() {
		return variationMarginCollateral;
	}

	public void setVariationMarginCollateral(com.tools20022.repository.entity.Collateral variationMarginCollateral) {
		this.variationMarginCollateral = variationMarginCollateral;
	}

	public Collateral getIndependentAmountCollateral() {
		return independentAmountCollateral;
	}

	public void setIndependentAmountCollateral(com.tools20022.repository.entity.Collateral independentAmountCollateral) {
		this.independentAmountCollateral = independentAmountCollateral;
	}

	public BlockedReasonCode getHoldingType() {
		return holdingType;
	}

	public void setHoldingType(BlockedReasonCode holdingType) {
		this.holdingType = holdingType;
	}

	public CurrencyAndAmount getGuaranteeAmount() {
		return guaranteeAmount;
	}

	public void setGuaranteeAmount(CurrencyAndAmount guaranteeAmount) {
		this.guaranteeAmount = guaranteeAmount;
	}
}