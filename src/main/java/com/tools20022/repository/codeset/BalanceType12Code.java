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
import com.tools20022.repository.codeset.BalanceType12Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the balance type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType12Code#Expected
 * BalanceType12Code.Expected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code#OpeningAvailable
 * BalanceType12Code.OpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code#InterimAvailable
 * BalanceType12Code.InterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code#ClosingAvailable
 * BalanceType12Code.ClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code#ForwardAvailable
 * BalanceType12Code.ForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code#ClosingBooked
 * BalanceType12Code.ClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code#InterimBooked
 * BalanceType12Code.InterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code#OpeningBooked
 * BalanceType12Code.OpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code#PreviouslyClosedBooked
 * BalanceType12Code.PreviouslyClosedBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code#Information
 * BalanceType12Code.Information}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
 * BalanceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"XPCD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceType12Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the balance type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BalanceType12Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code
	 * BalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expected"</li>
	 * </ul>
	 */
	public static final BalanceType12Code Expected = new BalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expected";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType12Code.mmObject();
			codeName = BalanceTypeCode.Expected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code
	 * BalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType12Code OpeningAvailable = new BalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType12Code.mmObject();
			codeName = BalanceTypeCode.OpeningAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code
	 * BalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType12Code InterimAvailable = new BalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType12Code.mmObject();
			codeName = BalanceTypeCode.InterimAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code
	 * BalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType12Code ClosingAvailable = new BalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType12Code.mmObject();
			codeName = BalanceTypeCode.ClosingAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code
	 * BalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardAvailable"</li>
	 * </ul>
	 */
	public static final BalanceType12Code ForwardAvailable = new BalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType12Code.mmObject();
			codeName = BalanceTypeCode.ForwardAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code
	 * BalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingBooked"</li>
	 * </ul>
	 */
	public static final BalanceType12Code ClosingBooked = new BalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType12Code.mmObject();
			codeName = BalanceTypeCode.ClosingBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code
	 * BalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimBooked"</li>
	 * </ul>
	 */
	public static final BalanceType12Code InterimBooked = new BalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType12Code.mmObject();
			codeName = BalanceTypeCode.InterimBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code
	 * BalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningBooked"</li>
	 * </ul>
	 */
	public static final BalanceType12Code OpeningBooked = new BalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType12Code.mmObject();
			codeName = BalanceTypeCode.OpeningBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code
	 * BalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyClosedBooked"</li>
	 * </ul>
	 */
	public static final BalanceType12Code PreviouslyClosedBooked = new BalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyClosedBooked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType12Code.mmObject();
			codeName = BalanceTypeCode.PreviouslyClosedBooked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType12Code
	 * BalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Information"</li>
	 * </ul>
	 */
	public static final BalanceType12Code Information = new BalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType12Code.mmObject();
			codeName = BalanceTypeCode.Information.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BalanceType12Code> codesByName = new LinkedHashMap<>();

	protected BalanceType12Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("XPCD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceType12Code";
				definition = "Specifies the balance type.";
				trace_lazy = () -> BalanceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceType12Code.Expected, com.tools20022.repository.codeset.BalanceType12Code.OpeningAvailable,
						com.tools20022.repository.codeset.BalanceType12Code.InterimAvailable, com.tools20022.repository.codeset.BalanceType12Code.ClosingAvailable, com.tools20022.repository.codeset.BalanceType12Code.ForwardAvailable,
						com.tools20022.repository.codeset.BalanceType12Code.ClosingBooked, com.tools20022.repository.codeset.BalanceType12Code.InterimBooked, com.tools20022.repository.codeset.BalanceType12Code.OpeningBooked,
						com.tools20022.repository.codeset.BalanceType12Code.PreviouslyClosedBooked, com.tools20022.repository.codeset.BalanceType12Code.Information);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Expected.getCodeName().get(), Expected);
		codesByName.put(OpeningAvailable.getCodeName().get(), OpeningAvailable);
		codesByName.put(InterimAvailable.getCodeName().get(), InterimAvailable);
		codesByName.put(ClosingAvailable.getCodeName().get(), ClosingAvailable);
		codesByName.put(ForwardAvailable.getCodeName().get(), ForwardAvailable);
		codesByName.put(ClosingBooked.getCodeName().get(), ClosingBooked);
		codesByName.put(InterimBooked.getCodeName().get(), InterimBooked);
		codesByName.put(OpeningBooked.getCodeName().get(), OpeningBooked);
		codesByName.put(PreviouslyClosedBooked.getCodeName().get(), PreviouslyClosedBooked);
		codesByName.put(Information.getCodeName().get(), Information);
	}

	public static BalanceType12Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BalanceType12Code[] values() {
		BalanceType12Code[] values = new BalanceType12Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BalanceType12Code> {
		@Override
		public BalanceType12Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BalanceType12Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}