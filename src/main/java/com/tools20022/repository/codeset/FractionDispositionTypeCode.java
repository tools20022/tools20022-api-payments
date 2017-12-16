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
import com.tools20022.repository.codeset.FractionDispositionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates that fractional value should be retained; no rounding.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#BuyUp
 * FractionDispositionTypeCode.mmBuyUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#CashInLieuOfFraction
 * FractionDispositionTypeCode.mmCashInLieuOfFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#Full
 * FractionDispositionTypeCode.mmFull}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#NoFraction
 * FractionDispositionTypeCode.mmNoFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#ProRate
 * FractionDispositionTypeCode.mmProRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#RoundUp
 * FractionDispositionTypeCode.mmRoundUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#RoundDown
 * FractionDispositionTypeCode.mmRoundDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#RoundToNearest
 * FractionDispositionTypeCode.mmRoundToNearest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#IssueFraction
 * FractionDispositionTypeCode.mmIssueFraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#DiscussFirst
 * FractionDispositionTypeCode.mmDiscussFirst}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#Specific
 * FractionDispositionTypeCode.mmSpecific}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#Standard
 * FractionDispositionTypeCode.mmStandard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#Retain
 * FractionDispositionTypeCode.mmRetain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#Expire
 * FractionDispositionTypeCode.mmExpire}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode#Unknown
 * FractionDispositionTypeCode.mmUnknown}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BUYU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FractionDispositionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates that fractional value should be retained; no rounding."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FractionDispositionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Buy securities up to next whole number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUYU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Buy securities up to next whole number."</li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode BuyUp = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyUp";
			definition = "Buy securities up to next whole number.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "BUYU";
		}
	};
	/**
	 * Fractional part of cash. Take cash in lieu of fractions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfFraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fractional part of cash. Take cash in lieu of fractions."</li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode CashInLieuOfFraction = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfFraction";
			definition = "Fractional part of cash. Take cash in lieu of fractions.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "CINL";
		}
	};
	/**
	 * Pre-allocate shares only if fully dealt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Full"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pre-allocate shares only if fully dealt."</li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode Full = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Full";
			definition = "Pre-allocate shares only if fully dealt.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * No fractional shares are allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoFraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No fractional shares are allowed."</li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode NoFraction = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoFraction";
			definition = "No fractional shares are allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "NOFR";
		}
	};
	/**
	 * In case of a partial fill, pro-rate the allocations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "In case of a partial fill, pro-rate the allocations."</li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode ProRate = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProRate";
			definition = "In case of a partial fill, pro-rate the allocations.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "PROR";
		}
	};
	/**
	 * Round up to the nearest whole number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Round up to the nearest whole number."</li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode RoundUp = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundUp";
			definition = "Round up to the nearest whole number.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "RDUP";
		}
	};
	/**
	 * Round down to the nearest whole number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Round down to the nearest whole number."</li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode RoundDown = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundDown";
			definition = "Round down to the nearest whole number.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "RDDN";
		}
	};
	/**
	 * If the fraction is greater than or equal to 0.5 of the resulting security
	 * then round up, else round down.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundToNearest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the fraction is greater than or equal to 0.5 of the resulting security then round up, else round down."
	 * </li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode RoundToNearest = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundToNearest";
			definition = "If the fraction is greater than or equal to 0.5 of the resulting security then round up, else round down.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "STAN";
		}
	};
	/**
	 * Take distribution of fractions in the form of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueFraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Take distribution of fractions in the form of securities."
	 * </li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode IssueFraction = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueFraction";
			definition = "Take distribution of fractions in the form of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "DIST";
		}
	};
	/**
	 * Do not pro-rate; discuss first.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TALK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscussFirst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Do not pro-rate; discuss first."</li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode DiscussFirst = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiscussFirst";
			definition = "Do not pro-rate; discuss first.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "TALK";
		}
	};
	/**
	 * Pre-allocate according to the amounts shown in a linked allocation
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Specific"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-allocate according to the amounts shown in a linked allocation instruction."
	 * </li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode Specific = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Specific";
			definition = "Pre-allocate according to the amounts shown in a linked allocation instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "SPEC";
		}
	};
	/**
	 * Indicates that if the fraction is greater than or equal to 0.5 of the
	 * value should be rounded up; otherwise rounded down.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that if the fraction is greater than or equal to 0.5 of the value should be rounded up; otherwise rounded down."
	 * </li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode Standard = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Standard";
			definition = "Indicates that if the fraction is greater than or equal to 0.5 of the value should be rounded up; otherwise rounded down.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "SSTD";
		}
	};
	/**
	 * Indicates that fractional value should be retained; no rounding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RETA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Retain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that fractional value should be retained; no rounding."</li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode Retain = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Retain";
			definition = "Indicates that fractional value should be retained; no rounding.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "RETA";
		}
	};
	/**
	 * Let fractions expire worthless.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expire"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Let fractions expire worthless."</li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode Expire = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Expire";
			definition = "Let fractions expire worthless.";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * Characteristics of the disposition of fractions are unknown
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FractionDispositionTypeCode
	 * FractionDispositionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Characteristics of the disposition of fractions are unknown"</li>
	 * </ul>
	 */
	public static final FractionDispositionTypeCode Unknown = new FractionDispositionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "Characteristics of the disposition of fractions are unknown";
			owner_lazy = () -> com.tools20022.repository.codeset.FractionDispositionTypeCode.mmObject();
			codeName = "UKWN";
		}
	};
	final static private LinkedHashMap<String, FractionDispositionTypeCode> codesByName = new LinkedHashMap<>();

	protected FractionDispositionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BUYU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FractionDispositionTypeCode";
				definition = "Indicates that fractional value should be retained; no rounding.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FractionDispositionTypeCode.BuyUp, com.tools20022.repository.codeset.FractionDispositionTypeCode.CashInLieuOfFraction,
						com.tools20022.repository.codeset.FractionDispositionTypeCode.Full, com.tools20022.repository.codeset.FractionDispositionTypeCode.NoFraction, com.tools20022.repository.codeset.FractionDispositionTypeCode.ProRate,
						com.tools20022.repository.codeset.FractionDispositionTypeCode.RoundUp, com.tools20022.repository.codeset.FractionDispositionTypeCode.RoundDown,
						com.tools20022.repository.codeset.FractionDispositionTypeCode.RoundToNearest, com.tools20022.repository.codeset.FractionDispositionTypeCode.IssueFraction,
						com.tools20022.repository.codeset.FractionDispositionTypeCode.DiscussFirst, com.tools20022.repository.codeset.FractionDispositionTypeCode.Specific,
						com.tools20022.repository.codeset.FractionDispositionTypeCode.Standard, com.tools20022.repository.codeset.FractionDispositionTypeCode.Retain, com.tools20022.repository.codeset.FractionDispositionTypeCode.Expire,
						com.tools20022.repository.codeset.FractionDispositionTypeCode.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BuyUp.getCodeName().get(), BuyUp);
		codesByName.put(CashInLieuOfFraction.getCodeName().get(), CashInLieuOfFraction);
		codesByName.put(Full.getCodeName().get(), Full);
		codesByName.put(NoFraction.getCodeName().get(), NoFraction);
		codesByName.put(ProRate.getCodeName().get(), ProRate);
		codesByName.put(RoundUp.getCodeName().get(), RoundUp);
		codesByName.put(RoundDown.getCodeName().get(), RoundDown);
		codesByName.put(RoundToNearest.getCodeName().get(), RoundToNearest);
		codesByName.put(IssueFraction.getCodeName().get(), IssueFraction);
		codesByName.put(DiscussFirst.getCodeName().get(), DiscussFirst);
		codesByName.put(Specific.getCodeName().get(), Specific);
		codesByName.put(Standard.getCodeName().get(), Standard);
		codesByName.put(Retain.getCodeName().get(), Retain);
		codesByName.put(Expire.getCodeName().get(), Expire);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static FractionDispositionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FractionDispositionTypeCode[] values() {
		FractionDispositionTypeCode[] values = new FractionDispositionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FractionDispositionTypeCode> {
		@Override
		public FractionDispositionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FractionDispositionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}