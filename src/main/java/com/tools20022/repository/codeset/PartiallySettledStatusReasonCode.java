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
import com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a partially settled status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode#UnitsPartiallySettled
 * PartiallySettledStatusReasonCode.mmUnitsPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode#CashPartiallySettled
 * PartiallySettledStatusReasonCode.mmCashPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode#UnitsCashPartiallySettled
 * PartiallySettledStatusReasonCode.mmUnitsCashPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode#HoldBackPendingAudit
 * PartiallySettledStatusReasonCode.mmHoldBackPendingAudit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode#HoldBackLiquidation
 * PartiallySettledStatusReasonCode.mmHoldBackLiquidation}</li>
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
 * <li>"UPST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartiallySettledStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a partially settled status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartiallySettledStatusReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Units are partially settled
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode
	 * PartiallySettledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UPST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsPartiallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Units are partially settled"</li>
	 * </ul>
	 */
	public static final PartiallySettledStatusReasonCode UnitsPartiallySettled = new PartiallySettledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsPartiallySettled";
			definition = "Units are partially settled";
			owner_lazy = () -> com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.mmObject();
			codeName = "UPST";
		}
	};
	/**
	 * Cash is partially settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode
	 * PartiallySettledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashPartiallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash is partially settled."</li>
	 * </ul>
	 */
	public static final PartiallySettledStatusReasonCode CashPartiallySettled = new PartiallySettledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashPartiallySettled";
			definition = "Cash is partially settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.mmObject();
			codeName = "CPST";
		}
	};
	/**
	 * Units and cash are both partially settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode
	 * PartiallySettledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsCashPartiallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Units and cash are both partially settled."</li>
	 * </ul>
	 */
	public static final PartiallySettledStatusReasonCode UnitsCashPartiallySettled = new PartiallySettledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsCashPartiallySettled";
			definition = "Units and cash are both partially settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.mmObject();
			codeName = "UCPS";
		}
	};
	/**
	 * Final redemption proceeds are held back, pending annual financial audit
	 * approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode
	 * PartiallySettledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBackPendingAudit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Final redemption proceeds are held back, pending annual financial audit approval."
	 * </li>
	 * </ul>
	 */
	public static final PartiallySettledStatusReasonCode HoldBackPendingAudit = new PartiallySettledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBackPendingAudit";
			definition = "Final redemption proceeds are held back, pending annual financial audit approval.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.mmObject();
			codeName = "HOLA";
		}
	};
	/**
	 * Final redemption proceeds are held back as the fund has been liquidated
	 * and is pending audit approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartiallySettledStatusReasonCode
	 * PartiallySettledStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBackLiquidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Final redemption proceeds are held back as the fund has been liquidated and is pending audit approval."
	 * </li>
	 * </ul>
	 */
	public static final PartiallySettledStatusReasonCode HoldBackLiquidation = new PartiallySettledStatusReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBackLiquidation";
			definition = "Final redemption proceeds are held back as the fund has been liquidated and is pending audit approval.";
			owner_lazy = () -> com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.mmObject();
			codeName = "HOLL";
		}
	};
	final static private LinkedHashMap<String, PartiallySettledStatusReasonCode> codesByName = new LinkedHashMap<>();

	protected PartiallySettledStatusReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("UPST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartiallySettledStatusReasonCode";
				definition = "Specifies the reason for a partially settled status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.UnitsPartiallySettled, com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.CashPartiallySettled,
						com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.UnitsCashPartiallySettled, com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.HoldBackPendingAudit,
						com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.HoldBackLiquidation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnitsPartiallySettled.getCodeName().get(), UnitsPartiallySettled);
		codesByName.put(CashPartiallySettled.getCodeName().get(), CashPartiallySettled);
		codesByName.put(UnitsCashPartiallySettled.getCodeName().get(), UnitsCashPartiallySettled);
		codesByName.put(HoldBackPendingAudit.getCodeName().get(), HoldBackPendingAudit);
		codesByName.put(HoldBackLiquidation.getCodeName().get(), HoldBackLiquidation);
	}

	public static PartiallySettledStatusReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartiallySettledStatusReasonCode[] values() {
		PartiallySettledStatusReasonCode[] values = new PartiallySettledStatusReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartiallySettledStatusReasonCode> {
		@Override
		public PartiallySettledStatusReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartiallySettledStatusReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}