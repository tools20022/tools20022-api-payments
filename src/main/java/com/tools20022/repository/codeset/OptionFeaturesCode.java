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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.OptionFeaturesCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the features that may apply to a corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode#NoServiceOffered
 * OptionFeaturesCode.NoServiceOffered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode#OptionApplicability
 * OptionFeaturesCode.OptionApplicability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode#Conditional
 * OptionFeaturesCode.Conditional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode#MaximumCash
 * OptionFeaturesCode.MaximumCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode#MaximumSecurities
 * OptionFeaturesCode.MaximumSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode#OddLotPreference
 * OptionFeaturesCode.OddLotPreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode#Proration
 * OptionFeaturesCode.Proration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode#OverAndAbove
 * OptionFeaturesCode.OverAndAbove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode#QuantityToReceive
 * OptionFeaturesCode.QuantityToReceive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode#ReducedWithholdingTax
 * OptionFeaturesCode.ReducedWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode#PreviousInstructionInvalidity
 * OptionFeaturesCode.PreviousInstructionInvalidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode#AccountServicerOption
 * OptionFeaturesCode.AccountServicerOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode#BeneficiaryOwnerInstruction
 * OptionFeaturesCode.BeneficiaryOwnerInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode#InstructCashAmount
 * OptionFeaturesCode.InstructCashAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NOSE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionFeaturesCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the features that may apply to a corporate action option."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionFeaturesCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Feature whereby the holder must elect directly to the issuer's agent
	 * (issuer only supported option).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoServiceOffered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Feature whereby the holder must elect directly to the issuer's agent (issuer only supported option)."
	 * </li>
	 * </ul>
	 */
	public static final OptionFeaturesCode NoServiceOffered = new OptionFeaturesCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoServiceOffered";
			definition = "Feature whereby the holder must elect directly to the issuer's agent (issuer only supported option).";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeaturesCode.mmObject();
			codeName = "NOSE";
		}
	};
	/**
	 * Option applicability is not subject to the account owner decision but
	 * depends on the terms defined by the issuer, for example in the case of
	 * equity linked notes or warrants.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionApplicability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option applicability is not subject to the account owner decision but depends on the terms defined by the issuer, for example in the case of equity linked notes or warrants."
	 * </li>
	 * </ul>
	 */
	public static final OptionFeaturesCode OptionApplicability = new OptionFeaturesCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionApplicability";
			definition = "Option applicability is not subject to the account owner decision but depends on the terms defined by the issuer, for example in the case of equity linked notes or warrants.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeaturesCode.mmObject();
			codeName = "CAOS";
		}
	};
	/**
	 * Feature whereby the holder can elect to place a condition on the
	 * acceptance of the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conditional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Feature whereby the holder can elect to place a condition on the acceptance of the option."
	 * </li>
	 * </ul>
	 */
	public static final OptionFeaturesCode Conditional = new OptionFeaturesCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Conditional";
			definition = "Feature whereby the holder can elect to place a condition on the acceptance of the option.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeaturesCode.mmObject();
			codeName = "COND";
		}
	};
	/**
	 * Maximum cash option, may be subject to scaling, as such you may receive a
	 * combination of cash and securities outturn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAXC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum cash option, may be subject to scaling, as such you may receive a combination of cash and securities outturn."
	 * </li>
	 * </ul>
	 */
	public static final OptionFeaturesCode MaximumCash = new OptionFeaturesCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumCash";
			definition = "Maximum cash option, may be subject to scaling, as such you may receive a combination of cash and securities outturn.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeaturesCode.mmObject();
			codeName = "MAXC";
		}
	};
	/**
	 * Maximum stock option, may be subject to scaling, as such you may receive
	 * a combination of securities and cash outturn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAXS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum stock option, may be subject to scaling, as such you may receive a combination of securities and cash outturn."
	 * </li>
	 * </ul>
	 */
	public static final OptionFeaturesCode MaximumSecurities = new OptionFeaturesCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumSecurities";
			definition = "Maximum stock option, may be subject to scaling, as such you may receive a combination of securities and cash outturn.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeaturesCode.mmObject();
			codeName = "MAXS";
		}
	};
	/**
	 * Tender or exchange with the odd lot preference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPLF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotPreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tender or exchange with the odd lot preference."</li>
	 * </ul>
	 */
	public static final OptionFeaturesCode OddLotPreference = new OptionFeaturesCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OddLotPreference";
			definition = "Tender or exchange with the odd lot preference.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeaturesCode.mmObject();
			codeName = "OPLF";
		}
	};
	/**
	 * Feature whereby the option can be subject to pro ration in case, for
	 * example, of over-subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Feature whereby the option can be subject to pro ration in case, for example, of over-subscription."
	 * </li>
	 * </ul>
	 */
	public static final OptionFeaturesCode Proration = new OptionFeaturesCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Proration";
			definition = "Feature whereby the option can be subject to pro ration in case, for example, of over-subscription.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeaturesCode.mmObject();
			codeName = "PROR";
		}
	};
	/**
	 * Feature whereby the holder can elect a quantity to receive over and above
	 * normal ensured entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QOVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverAndAbove"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Feature whereby the holder can elect a quantity to receive over and above normal ensured entitlement."
	 * </li>
	 * </ul>
	 */
	public static final OptionFeaturesCode OverAndAbove = new OptionFeaturesCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverAndAbove";
			definition = "Feature whereby the holder can elect a quantity to receive over and above normal ensured entitlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeaturesCode.mmObject();
			codeName = "QOVE";
		}
	};
	/**
	 * Feature whereby the holder can elect a quantity to receive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityToReceive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Feature whereby the holder can elect a quantity to receive."</li>
	 * </ul>
	 */
	public static final OptionFeaturesCode QuantityToReceive = new OptionFeaturesCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuantityToReceive";
			definition = "Feature whereby the holder can elect a quantity to receive.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeaturesCode.mmObject();
			codeName = "QREC";
		}
	};
	/**
	 * Reduced withholding tax rate applies to the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VVPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReducedWithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reduced withholding tax rate applies to the option."</li>
	 * </ul>
	 */
	public static final OptionFeaturesCode ReducedWithholdingTax = new OptionFeaturesCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReducedWithholdingTax";
			definition = "Reduced withholding tax rate applies to the option.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeaturesCode.mmObject();
			codeName = "VVPR";
		}
	};
	/**
	 * Indicates the previously sent instructions becomes invalid. This is only
	 * applicable after a market deadline extension.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructionInvalidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the previously sent instructions becomes invalid. This is only applicable after a market deadline extension."
	 * </li>
	 * </ul>
	 */
	public static final OptionFeaturesCode PreviousInstructionInvalidity = new OptionFeaturesCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviousInstructionInvalidity";
			definition = "Indicates the previously sent instructions becomes invalid. This is only applicable after a market deadline extension.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeaturesCode.mmObject();
			codeName = "PINS";
		}
	};
	/**
	 * Option is offered by the account servicer only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASVO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option is offered by the account servicer only."</li>
	 * </ul>
	 */
	public static final OptionFeaturesCode AccountServicerOption = new OptionFeaturesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerOption";
			definition = "Option is offered by the account servicer only.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeaturesCode.mmObject();
			codeName = "ASVO";
		}
	};
	/**
	 * Indicates that the holder needs to instruct at beneficiary owner level
	 * only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryOwnerInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the holder needs to instruct at beneficiary owner level only."
	 * </li>
	 * </ul>
	 */
	public static final OptionFeaturesCode BeneficiaryOwnerInstruction = new OptionFeaturesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryOwnerInstruction";
			definition = "Indicates that the holder needs to instruct at beneficiary owner level only.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeaturesCode.mmObject();
			codeName = "BOIS";
		}
	};
	/**
	 * Feature whereby the holder should only instruct a cash amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionFeaturesCode
	 * OptionFeaturesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QCAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Feature whereby the holder should only instruct a cash amount."</li>
	 * </ul>
	 */
	public static final OptionFeaturesCode InstructCashAmount = new OptionFeaturesCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructCashAmount";
			definition = "Feature whereby the holder should only instruct a cash amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionFeaturesCode.mmObject();
			codeName = "QCAS";
		}
	};
	final static private LinkedHashMap<String, OptionFeaturesCode> codesByName = new LinkedHashMap<>();

	protected OptionFeaturesCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NOSE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionFeaturesCode";
				definition = "Specifies the features that may apply to a corporate action option.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionFeaturesCode.NoServiceOffered, com.tools20022.repository.codeset.OptionFeaturesCode.OptionApplicability,
						com.tools20022.repository.codeset.OptionFeaturesCode.Conditional, com.tools20022.repository.codeset.OptionFeaturesCode.MaximumCash, com.tools20022.repository.codeset.OptionFeaturesCode.MaximumSecurities,
						com.tools20022.repository.codeset.OptionFeaturesCode.OddLotPreference, com.tools20022.repository.codeset.OptionFeaturesCode.Proration, com.tools20022.repository.codeset.OptionFeaturesCode.OverAndAbove,
						com.tools20022.repository.codeset.OptionFeaturesCode.QuantityToReceive, com.tools20022.repository.codeset.OptionFeaturesCode.ReducedWithholdingTax,
						com.tools20022.repository.codeset.OptionFeaturesCode.PreviousInstructionInvalidity, com.tools20022.repository.codeset.OptionFeaturesCode.AccountServicerOption,
						com.tools20022.repository.codeset.OptionFeaturesCode.BeneficiaryOwnerInstruction, com.tools20022.repository.codeset.OptionFeaturesCode.InstructCashAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NoServiceOffered.getCodeName().get(), NoServiceOffered);
		codesByName.put(OptionApplicability.getCodeName().get(), OptionApplicability);
		codesByName.put(Conditional.getCodeName().get(), Conditional);
		codesByName.put(MaximumCash.getCodeName().get(), MaximumCash);
		codesByName.put(MaximumSecurities.getCodeName().get(), MaximumSecurities);
		codesByName.put(OddLotPreference.getCodeName().get(), OddLotPreference);
		codesByName.put(Proration.getCodeName().get(), Proration);
		codesByName.put(OverAndAbove.getCodeName().get(), OverAndAbove);
		codesByName.put(QuantityToReceive.getCodeName().get(), QuantityToReceive);
		codesByName.put(ReducedWithholdingTax.getCodeName().get(), ReducedWithholdingTax);
		codesByName.put(PreviousInstructionInvalidity.getCodeName().get(), PreviousInstructionInvalidity);
		codesByName.put(AccountServicerOption.getCodeName().get(), AccountServicerOption);
		codesByName.put(BeneficiaryOwnerInstruction.getCodeName().get(), BeneficiaryOwnerInstruction);
		codesByName.put(InstructCashAmount.getCodeName().get(), InstructCashAmount);
	}

	public static OptionFeaturesCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionFeaturesCode[] values() {
		OptionFeaturesCode[] values = new OptionFeaturesCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionFeaturesCode> {
		@Override
		public OptionFeaturesCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionFeaturesCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}