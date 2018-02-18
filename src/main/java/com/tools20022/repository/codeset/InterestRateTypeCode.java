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
import com.tools20022.repository.codeset.InterestRateTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of interest rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InterestRateTypeCode#Fixed
 * InterestRateTypeCode.Fixed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestRateTypeCode#Forfeit
 * InterestRateTypeCode.Forfeit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestRateTypeCode#Variable
 * InterestRateTypeCode.Variable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestRateTypeCode#Scheduled
 * InterestRateTypeCode.Scheduled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestRateTypeCode#Unscheduled
 * InterestRateTypeCode.Unscheduled}</li>
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
 * <li>"FIXE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestRateTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of interest rate."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InterestRateTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rate is fixed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRateTypeCode
	 * InterestRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIXE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fixed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate is fixed."</li>
	 * </ul>
	 */
	public static final InterestRateTypeCode Fixed = new InterestRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			definition = "Rate is fixed.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestRateTypeCode.mmObject();
			codeName = "FIXE";
		}
	};
	/**
	 * No specific repurchase rate applies to the transaction Repo, only a
	 * forfeit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRateTypeCode
	 * InterestRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Forfeit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "No specific repurchase rate applies to the transaction Repo, only a forfeit."
	 * </li>
	 * </ul>
	 */
	public static final InterestRateTypeCode Forfeit = new InterestRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Forfeit";
			definition = "No specific repurchase rate applies to the transaction Repo, only a forfeit.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestRateTypeCode.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * Rate is variable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRateTypeCode
	 * InterestRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VARI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Variable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate is variable."</li>
	 * </ul>
	 */
	public static final InterestRateTypeCode Variable = new InterestRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Variable";
			definition = "Rate is variable.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestRateTypeCode.mmObject();
			codeName = "VARI";
		}
	};
	/**
	 * Rate of the scheduled payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRateTypeCode
	 * InterestRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCHD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scheduled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of the scheduled payment."</li>
	 * </ul>
	 */
	public static final InterestRateTypeCode Scheduled = new InterestRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Scheduled";
			definition = "Rate of the scheduled payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestRateTypeCode.mmObject();
			codeName = "SCHD";
		}
	};
	/**
	 * Rate of the unscheduled payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRateTypeCode
	 * InterestRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unscheduled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of the unscheduled payment."</li>
	 * </ul>
	 */
	public static final InterestRateTypeCode Unscheduled = new InterestRateTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unscheduled";
			definition = "Rate of the unscheduled payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestRateTypeCode.mmObject();
			codeName = "USCD";
		}
	};
	final static private LinkedHashMap<String, InterestRateTypeCode> codesByName = new LinkedHashMap<>();

	protected InterestRateTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FIXE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestRateTypeCode";
				definition = "Specifies the type of interest rate.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InterestRateTypeCode.Fixed, com.tools20022.repository.codeset.InterestRateTypeCode.Forfeit, com.tools20022.repository.codeset.InterestRateTypeCode.Variable,
						com.tools20022.repository.codeset.InterestRateTypeCode.Scheduled, com.tools20022.repository.codeset.InterestRateTypeCode.Unscheduled);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fixed.getCodeName().get(), Fixed);
		codesByName.put(Forfeit.getCodeName().get(), Forfeit);
		codesByName.put(Variable.getCodeName().get(), Variable);
		codesByName.put(Scheduled.getCodeName().get(), Scheduled);
		codesByName.put(Unscheduled.getCodeName().get(), Unscheduled);
	}

	public static InterestRateTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InterestRateTypeCode[] values() {
		InterestRateTypeCode[] values = new InterestRateTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InterestRateTypeCode> {
		@Override
		public InterestRateTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InterestRateTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}